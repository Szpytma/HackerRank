import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Specify size of your array");
    int arraySize = scanner.nextInt();
    int[] array = new int[arraySize];
    System.out.println("Input " + arraySize + " elements of your array");
    for (int i = 0; i < arraySize; i++) {
      array[i] = scanner.nextInt();
    }

    int totalSwaps = 0;
    for (int i = arraySize - 1; i > 0; i--) {
      int numberOfSwaps = 0;
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          numberOfSwaps++;
          totalSwaps++;
        }
      }
      if (numberOfSwaps == 0) {
        break;
      }
    }
    System.out.println("Array is sorted in " + totalSwaps + " swaps.");
    System.out.println("First Element: " + array[0]);
    System.out.println("Last Element: " + array[arraySize - 1]);

  }

}

