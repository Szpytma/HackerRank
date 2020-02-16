import java.util.*;

class Printer<T> {

  /**
   * Method Name: printArray Print each element of the generic array on a new line. Do not return
   * anything.
   *
   * @param A generic array
   **/
  public void printArray(T[] A) {
    for (T elements : A) {
      System.out.println(elements);
    }
  }
}

class Generics {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide size of your intArray");
    int n = scanner.nextInt();
    Integer[] intArray = new Integer[n];
    System.out.println("Please provide " + n + " elements of your intArray");
    for (int i = 0; i < n; i++) {
      intArray[i] = scanner.nextInt();
    }
    System.out.println("Please provide size of your stringArray");
    n = scanner.nextInt();
    String[] stringArray = new String[n];
    System.out.println("Please provide " + n + " elements of your intArray");
    for (int i = 0; i < n; i++) {
      stringArray[i] = scanner.next();
    }

    Printer<Integer> intPrinter = new Printer<Integer>();
    Printer<String> stringPrinter = new Printer<String>();
    intPrinter.printArray(intArray);
    stringPrinter.printArray(stringArray);
    if (Printer.class.getDeclaredMethods().length > 1) {
      System.out.println("The Printer class should only have 1 method named printArray.");
    }
  }
}