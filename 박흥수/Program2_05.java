package PDF;

public class Program2_05 {

	public static void main(String[] args) {

		int n = 5;

		// [05]
		System.out.print("2-5) number = 5\n");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.printf(" ");
			for (int j = 0; j < 2 * i - 1; j++)
				System.out.printf("*");
			System.out.println();
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
