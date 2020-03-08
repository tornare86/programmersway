public class Program3_05 {
   public static void main(String[] args) {

      int n = 7;

      // [05]
      System.out.print("3-5) number = 7\n");
      System.out.println();

      int[][] num = new int[n][n];

      for (int i = 0; i < n; i++)
         for (int j = 0; j < n; j++) {
            num[0][j] = 9;
            num[i][0] = 9;
            num[i][i] = 9;
            num[i][n - 1] = 9;
            num[n - 1][j] = 9;
            num[i][n - 1 - i] = 9;
         }

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++)
            System.out.printf("%2d ", num[i][j]);
         System.out.println();
      }

   }
}