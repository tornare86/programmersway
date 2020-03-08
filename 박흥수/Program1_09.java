package PDF;

public class Program1_09 {

	public static void main(String[] args) {

		int n = 5;

		// [09]
		System.out.print("1-9) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.printf("%2d ", (i + j) % n + 1);
			System.out.println();
		}

	}
}
