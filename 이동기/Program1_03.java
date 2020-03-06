package RoadOfJava;

public class Program1_03 {
	
	public static void main(String[] args) {
		
/*		1-3) number = 5

				1    3    5    7    9
				11   13   15   17   19
				21   23   25   27   29
				31   33   35   37   39
				41   43   45   47   49
*/
		int n = 5;
		int k = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ",k+=2);
			}
			System.out.print("\n");
		}
		
		
	}
}
