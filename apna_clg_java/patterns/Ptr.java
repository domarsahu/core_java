package patterns;

public class Ptr {

  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <=(n-i)+1; j++) {

        System.out.print(j+ " ");


      }
              System.out.println(" ");

    }
  }
}
