package PDF;

public class Program2_10a {

	public static void main(String[] args) {

		int n = 5;

		// [10]
		System.out.print("2-10) number = 5\n");
		System.out.println();

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < j + 1; i++)
				System.out.print("*");
			System.out.println();
		}

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			for (int i = 0; i < j + 1; i++)
				System.out.print("@");
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			System.out.println();
		}

		for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			for (int i = 0; i < n - 1 - j; i++)
				System.out.print("@");
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			System.out.println();
		}

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 2 - j; i++)
				System.out.print("*");
			System.out.println();
		}
	}
}
