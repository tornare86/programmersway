package programmersway;

public class Program1_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1    2    3    4    5
//
//		1    2    3    4
//
//		1    2    3
//
//		1    2
//
//		1


		
		for(int y=0; y<5; y++) {
			for(int x=1; x<=5-y; x++) {
				System.out.printf("%2d " , x);
			}
			System.out.println();
		}
	}
}
