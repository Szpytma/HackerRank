import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
  Stack<Character> stack = new Stack<>();
  Queue<Character> queue = new LinkedList<>();

  // method that pushes a character onto a stack.
  private void pushCharacter(char c) {
    stack.push(c);
  }

  // method that enqueues a character in the queue instance variable.
  private void enqueueCharacter(char c) {
    queue.add(c);
  }

  // method that pops and returns the character at the top of the stack instance variable.
  private Character popCharacter() {
    return stack.pop();
  }

  // method that dequeues and returns the first character in the queue instance variable
  private Character dequeueCharacter() {
    return queue.poll();
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Solution p = new Solution();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println( "The word, " + input + ", is "
        + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
  }
}