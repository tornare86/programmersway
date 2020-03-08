package PDF;

public class Program2_04 {

	public static void main(String[] args) {

		int n = 5;

		// [04]
		System.out.print("2-4) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.printf(" ");
			for (int j = 0; j < 2 * i + 1; j++)
				System.out.printf("*");
			System.out.println();
		}

	}
}
