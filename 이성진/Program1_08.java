package programmersway;

public class Program1_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				1    2    3    4    5
//
//				2    3    4    5    6
//
//				3    4    5    6    7
//
//				4    5    6    7    8
//
//				5    6    7    8    9
//		int num = 1;
//		for (int y = 0; y < 5; y++) {
//			for (int x = 1; x <= 5; x++) {
//				System.out.printf("%2d ", num);
//				num++;
//			}
//			num -= 4;
//			System.out.println();
//		}
		int num = 1;
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				System.out.printf("%2d " , num+y);
			}
			num++;
			System.out.println();
		}

	}

}
