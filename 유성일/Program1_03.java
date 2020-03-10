public class Program1_03 {

   public static void main(String[] args) {
      int n =2;
      int sum =0;
      int num =0;
      
      for(int i =0; i <5 ;i++ ) {
         for(int j=0 ; j <5; j++) {
            sum = n*j +1+num;
            System.out.print(" "+sum);
         }
         num +=10;
         System.out.println();
      }
}
}
