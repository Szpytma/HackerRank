import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] binary = Integer.toBinaryString(n).split("0+");
        Arrays.sort(binary);
        System.out.println(binary[binary.length - 1].length());

        scanner.close();
    }
}
