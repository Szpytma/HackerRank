import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    try{
      //trying to parse given String to Integer
      System.out.println(Integer.parseInt(S));
    }catch(Exception e){

      // If our string is not a number print Exception message
      System.out.println("Bad String");

    }
  }
}


