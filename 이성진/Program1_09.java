package programmersway;

public class Program1_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				1    2    3    4    5
//
//				2    3    4    5    1
//
//				3    4    5    1    2
//
//				4    5    1    2    3
//
//				5    1    2    3    4

		int num = 0;
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				System.out.printf("%2d " , (num+y)%5 + 1);
			}
			num++;
			System.out.println();
		}
	}
}
