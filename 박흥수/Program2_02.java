public class Program2_02 {
   public static void main(String[] arguments) {

      int x = 5;

      // [02]
      System.out.print("──────[02]──────\n");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++)
            System.out.print(" ");
         for (int j = 0; j < i + 1; j++)
            System.out.print("*");
         System.out.println();
      }
   }
}