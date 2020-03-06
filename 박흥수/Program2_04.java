public class Program2_04 {
   public static void main(String[] arguments) {
      int x = 5;

      // [04]
      System.out.print("──────[04]──────\n");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x - i + 2; j++)
            System.out.print(" ");
         for (int j = 0; j < i + 1; j++)
            System.out.print("*");
         for (int j = 0; j < i; j++)
            System.out.print("*");
         System.out.println();
      }
   }
}