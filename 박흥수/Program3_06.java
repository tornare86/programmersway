package PDF;

public class Program3_06 {

	public static void main(String[] args) {

		int n = 5;

		// [06]
		System.out.print("3-6) number = 5\n");
		System.out.println();

		int[][] num = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if ((i + j) % 2 == 0)
					num[i][j] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.printf("%2d ", num[i][j]);
			System.out.println();
		}

	}
}
