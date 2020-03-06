package RoadOfJava;

public class Program1_04 {

	public static void main(String[] args) {
		
/*		1-4) number = 5

				1
				1    2
				1    2    3
				1    2    3    4
				1    2    3    4    5
*/
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.print("\n");
		}
	}
}
