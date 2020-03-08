package PDF;

public class Program1_10 {

	public static void main(String[] args) {

		int n = 5;

		// [10]
		System.out.print("1-10) number = 5\n");
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print("   ");
			for (int j = 1; j <= i; j++)
				System.out.printf("%2d ", i * (i - 1) / 2 + j);
			System.out.println();
		}

	}
}
