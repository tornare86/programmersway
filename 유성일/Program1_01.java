public class Program1_01 {

   public static void main(String[] args) {
      int n =5;
      int a = 0;
      for(int i = 0; i <5; i++) {    
         for(int j =1; j <=5; j++) {//row
            a= n*i +j;
            System.out.printf("%d ", a);
         }
         System.out.println();
      }
}
}
