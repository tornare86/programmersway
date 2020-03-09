
public class Program1_02 {

   public static void main(String[] args) {
      int n =5;
      int a = 0;
      
      for(int j = 4; j >=0; j--) {    
         for(int i =1; i <=5; i++) {//row
            a= n*j +i;
            System.out.printf("%d ", a);
         }
         System.out.println();
      }
}
}

      
/*
 * 1-2) number = 5

21   22   23   24   25
16   17   18   19   20
11   12   13   14   15
 6    7    8    9   10
 1    2    3    4    5
 */


/*
 *  5*4 +1 5*4 +2 5*4 +3 5*4 +4 5*4 +5
 *  5*3 +1 5*3 +2 5*3 +3 5*3 +4 5*3 +5
  */
