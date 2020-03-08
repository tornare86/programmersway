package PDF;

public class Program1_07 {

   public static void main(String[] args) {

      int n = 5;

      // [07]
      System.out.print("1-7) number = 5\n");
      System.out.println();

      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n - i + 1; j++)
            System.out.printf("%2d ", i * n - i * (i - 1) / 2 - (n - j - i + 1));
         System.out.println();
      }

   }
}