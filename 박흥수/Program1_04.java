package PDF;

public class Program1_04 {

	public static void main(String[] args) {

		int n = 5;

		// [04]
		System.out.print("1-4) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.printf("%2d ", j + 1);
			System.out.println();
		}

	}
}
