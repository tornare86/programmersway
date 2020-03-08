public class Program3_01 {

	public static void main(String[] args) {

		int n = 5;

		// [01]
		System.out.print("3-1) number = 5\n");
		System.out.println();

		int[][] num = new int[n][n];
		int x = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num[i][j] = ++x;
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}

	}
}
