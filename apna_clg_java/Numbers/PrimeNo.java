package Numbers;

public class PrimeNo {

  public static void main(String[] args) {
    boolean ans = true;
    int n = 4;
    for (int i = n - 1; i > 1; i--) {
      if (n == 2) {
        break;
      }
      if (n % i == 0) {
        ans = false;
        break;
      }
    }
    if (ans) {
      System.out.println("prime no");
    } else {
      System.out.println("not a prime no");
    }
  }
}
