package programmersway;

public class Program1_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1-4) number = 5
//
//
//
//				1
//
//				1    2
//
//				1    2    3
//
//				1    2    3    4
//
//				1    2    3    4    5

		
		
			for(int y= 1; y<=5; y++) {
				for(int x=1; x<=y; x++)
					System.out.printf("%2d " , x);
				System.out.println();
			}
	}
}
