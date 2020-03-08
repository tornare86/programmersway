package PDF;

public class Program2_08a {

	public static void main(String[] args) {

		int n = 5;

		// [08]
		System.out.print("2-8) number = 5\n");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3 * n - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i - 1; j++)
				System.out.print("*");
			for (int j = 0; j < 2 * (n - i); j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			for (int j = 0; j < 2 * n - 1; j++)
				System.out.print("*");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			for (int j = 0; j < 2 * (n - i); j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}

	}
}
