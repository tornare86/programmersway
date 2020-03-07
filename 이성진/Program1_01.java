package programmersway;

public class Program1_01 {

	public static void main(String[] args) {

//		1    2    3    4    5
//
//		6    7    8    9   10
//
//		11   12   13   14   15
//
//		16   17   18   19   20
//
//		21   22   23   24   25
		int num = 0;
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				num++;
				System.out.printf("%2d " , num);
			}
			System.out.println();
		}
	}
}
