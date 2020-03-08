package PDF;

public class Program3_04 {

	public static void main(String[] args) {

		int n = 5;

		// [04]
		System.out.print("3-4) number = 5\n");
		System.out.println();

		int[][] num = new int[n][n];
		int x = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (i % 2 == 0)
					num[i][j] = ++x;
				else
					num[i][n - j - 1] = ++x;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.printf("%2d ", num[i][j]);
			System.out.println();
		}

	}
}
