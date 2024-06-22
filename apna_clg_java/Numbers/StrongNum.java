package Numbers;

public class StrongNum {

  public static int factorial(int num) {
    int factorial = 1;
    for (int i = num; i >= 1; i--) {
      factorial = factorial * i;
    }
    return factorial;
  }

  public static void main(String[] args) {
    int number = 120;
    int orig = number;
    int temp = number;
    int cnt = 0;

    while (temp > 0) {
      cnt++;
      temp /= 10;
    }
    // System.out.println(cnt);
    int sum = 0;
    for (int i = 1; i <= cnt; i++) {
      int digit = number % 10;
      sum = sum + factorial(digit);
      number /= 10;
    }
    if (orig == sum) {
      System.out.println("strong number");
    } else {
      System.out.println("i tis not a strong number");
    }
  }
}
