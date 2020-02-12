import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;

        for (int i = 0; i < n; i++) {
            s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
