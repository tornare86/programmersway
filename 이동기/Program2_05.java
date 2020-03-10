package RoadOfJava;

public class Program2_05 {

	public static void main(String[] args) {

/*		2-5) number = 5

	    *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *	   
*/			

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= 2 * i - 1; k++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j < i; j++)
				System.out.printf(" ");
			for (int j = 0; j < 2 * (n - i) - 1; j++)
				System.out.printf("*");
			System.out.println();
		}

	}

}

