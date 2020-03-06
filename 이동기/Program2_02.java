package RoadOfJava;

public class Program2_02 {

	public static void main(String[] args) {
		
/*		2-2) number = 5

				*
				**
				***
				****
				*****
*/
		
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
