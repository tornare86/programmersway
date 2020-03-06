public class Program2_03 {
   public static void main(String[] arguments) {
      int x = 5;

      // [03]
      System.out.print("──────[03]──────\n");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x - i + 3; j++)
            System.out.print(" ");
         for (int j = 0; j < i + 1; j++)
            System.out.print("*");
         System.out.println();
      }
   }
}