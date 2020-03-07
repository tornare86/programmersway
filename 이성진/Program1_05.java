package programmersway;

public class Program1_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1
//
//		2    3
//
//		4    5    6
//
//		7    8    9   10
//
//		11   12   13   14   15

		int num = 1;
		for (int y = 1; y <= 5; y++) {
			for (int x = 0; x < y; x++) {
				System.out.printf("%2d ", num);
				num++;
			}
				System.out.println();
			
		}
	}
}
