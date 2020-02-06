import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    /* Read input from STDIN. Print output to STDOUT. */
    Scanner scan = new Scanner(System.in);
    int i =1;
    while (scan.hasNextLine()) {
      System.out.println(i++ +" "+ scan.nextLine());

    }


  }
}

