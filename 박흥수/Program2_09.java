package PDF;

public class Program2_09a {

	public static void main(String[] args) {

		int n = 5;

		// [09]
		System.out.print("2-9) number = 5\n");
		System.out.println();

		for (int j = 0; j < n + 2; j++)
			System.out.print("$");
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 1; j++)
				System.out.print("$");
			for (int j = 0; j < n; j++)
				System.out.print("*");
			for (int j = 0; j < 1; j++)
				System.out.print("$");
			System.out.println();
		}
		for (int j = 0; j < n + 2; j++)
			System.out.print("$");
		System.out.println();

	}
}
