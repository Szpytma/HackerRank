import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        String note = "";
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        int average = sum / testScores.length;
        if (90 <= average && average <= 100) {
            note = "O";
            return note;
        }
        if (80 <= average && average <= 89) {
            note = "E";
            return note;
        }
        if (70 <= average && average <= 79) {
            note = "A";
            return note;
        }
        if (55 <= average && average <= 79) {
            note = "P";
            return note;
        }
        if (40 <= average && average <= 54) {
            note = "D";
            return note;
        }
        if (average < 39) {
            note = "T";
            return note;
        } else {
            return null;
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}