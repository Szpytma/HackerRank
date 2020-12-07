public class Solution {
    static String result = "";

    public static String run(String first_strike_army_name, int no_of_dragons, int no_of_white_lords) {
        Army sevenKingdomArmy;
        Army whiteWalkerArmy;


        int attackCounter = 0;
        if (no_of_dragons < 0 || no_of_white_lords < 0) {
            return "Invalid parameter provided";
        }

        sevenKingdomArmy = new Army(new Soldiers(600, 600, no_of_dragons),
                new Soldiers(2, 2, 5000),
                "Seven Kingdom Army");

        whiteWalkerArmy = new Army(new Soldiers(50, 600, no_of_white_lords),
                new Soldiers(1, 3, 10000),
                "White Walker Army");

        while (result.isEmpty()) {
            if (first_strike_army_name.equals(sevenKingdomArmy.getArmyName())) {
                attack(sevenKingdomArmy, whiteWalkerArmy);
                first_strike_army_name = whiteWalkerArmy.getArmyName();
            } else {
                attack(whiteWalkerArmy, sevenKingdomArmy);
                first_strike_army_name = sevenKingdomArmy.getArmyName();
            }
            attackCounter++;
        }
        return result + "|" + attackCounter;
    }

    private static void attack(Army attacker, Army defender) {
        int attack = attacker.getAttackValue();
        attack = infantryAttack(defender, attack);
        eliteAttack(defender, attack);
        tryToAssignWinner(attacker, defender);
    }

    private static int infantryAttack(Army defender, int attack) {

        while (attack > defender.getInfantryDefense() && defender.areInfantryStillAlive()) {
            defender.infantryDie();
            attack -= defender.getInfantryDefense();
        }
        return attack;
    }

    private static void eliteAttack(Army defender, int attack) {
        while (attack > defender.getEliteDefense() && defender.areEliteStillAlive()) {
            defender.eliteDie();
            attack -= defender.getEliteDefense();
        }

    }

    private static void tryToAssignWinner(Army attacker, Army defender) {
        if (!defender.areEliteStillAlive() && !defender.areInfantryStillAlive()) {
            result = attacker.getArmyName();
        }


    }

    static class Soldiers {
        int attack;
        int defence;
        int number;

        public Soldiers(int attack, int defence, int number) {
            this.attack = attack;
            this.defence = defence;
            this.number = number;
        }
    }

    public static class Army {
        public Soldiers elite;
        public Soldiers infantry;
        public String armyName;

        public Army(Soldiers elite, Soldiers infantry, String armyName) {
            this.elite = elite;
            this.infantry = infantry;
            this.armyName = armyName;
        }

        public String getArmyName() {
            return armyName;
        }

        public int getAttackValue() {
            return elite.attack * elite.number +
                    infantry.attack * infantry.number;
        }

        public void eliteDie() {
            elite.number--;
        }

        public int getEliteDefense() {
            return elite.number;
        }

        public boolean areEliteStillAlive() {
            return elite.number > 0;
        }

        public void infantryDie() {
            infantry.number--;
        }

        public int getInfantryDefense() {
            return infantry.defence;
        }

        public boolean areInfantryStillAlive() {
            return infantry.number > 0;
        }
    }
}
