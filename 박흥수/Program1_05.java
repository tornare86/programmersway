package PDF;

public class Program1_05 {

	public static void main(String[] args) {

		int n = 5;

		// [05]
		System.out.print("1-5) number = 5\n");
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("%2d ", i * (i - 1) / 2 + j);
			System.out.println();
		}

	}
}
