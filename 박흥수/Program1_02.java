package PDF;

public class Program1_02 {

	public static void main(String[] args) {

		int n = 5;

		// [01]
		System.out.print("1-2) number = 5\n");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.printf("%2d ", n * (n - i) + j);
			System.out.println();
		}

	}
}
