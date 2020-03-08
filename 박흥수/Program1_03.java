package PDF;

public class Program1_03 {

	public static void main(String[] args) {

		int n = 5;

		// [03]
		System.out.print("1-3) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.printf("%2d ", (2 * j + 1) + (2 * i * n));
			System.out.println();
		}

	}
}
