

public class Ptr20 {

  public static void main(String[] args) {
    int n = 5;
    int m = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i-1; j++) {

    System.out.print(" ");

      }
      for (int j = 1; j <=m; j++) {

    System.out.print("* ");

      }
      System.out.println();
    }
  }
}
