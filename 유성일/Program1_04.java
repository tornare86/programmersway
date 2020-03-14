import java.util.Scanner;

public class Program1_04 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
      for(int i = 0; i <number ; i++) {
         for(int j = 0; j <i+1; j++){
            System.out.printf("%d ",j+1);
         }
         System.out.println();
      }
   }
}
