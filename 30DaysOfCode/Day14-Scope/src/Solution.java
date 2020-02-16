import java.util.Scanner;

class Difference {
  private int[] elements;
  public int maximumDifference;

  public Difference(int[] elements) {
    this.elements = elements;
    this.maximumDifference = computeDifference();
  }

  public int computeDifference() {
    int min = elements[0];
    int max = elements[0];

    for (int value : elements) {
      if (value < min) {
        min = value;
      }
      if (value > max) {
        max = value;
      }
    }
    return max - min;
  }
  }

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Difference difference = new Difference(a);

    difference.computeDifference();

    System.out.print(difference.maximumDifference);
  }
}