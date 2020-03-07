package programmersway;

public class Program1_02 {

	public static void main(String[] args) {
//		21   22   23   24   25
//
//		16   17   18   19   20
//
//		11   12   13   14   15
//
//		6    7    8    9   10
//
//		1    2    3    4    5
		int num = 20;

		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				num++;
				System.out.printf("%2d " , num);
			}
			System.out.println();
			num -= 10;
		}
	}

}
