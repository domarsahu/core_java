public class Ptr24 {

  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = n; j >= 1; j--) {
            if (j<=(n-i+1)) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           

        }
        System.out.println();
    }
  }
}
