package RoadOfJava;

public class Program1_02 {

	public static void main(String[] args) {
/*		1-2) number = 5

				21   22   23   24   25
				16   17   18   19   20
				11   12   13   14   15
				6    7    8    9   10
				1    2    3    4    5
*/
		int n = 5;
		int k = 0;
		for (int i = 0; i < n; i++) {
			k = 20 - 5 * i;
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", ++k);
			}
			System.out.print("\n");
		}
	}

}
