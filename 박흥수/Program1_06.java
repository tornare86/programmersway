package PDF;

public class Program1_06 {

	public static void main(String[] args) {

		int n = 5;

		// [06]
		System.out.print("1-6) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5 - i; j++)
				System.out.printf("%2d ", j + 1);
			System.out.println();
		}

	}
}
