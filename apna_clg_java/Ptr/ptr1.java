package Ptr;

public class ptr1 {

  public static void main(String[] args) {
    int n = 3;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j <= (2 * (n - i)) - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
     for (int i = n-1; i >=1; i--) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j <= (2 * (n - i)) - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
