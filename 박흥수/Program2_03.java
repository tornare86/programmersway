package PDF;

public class Program2_03 {

	public static void main(String[] args) {

		int n = 5;

		// [03]
		System.out.print("2-3) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.printf(" ");
			for (int j = 0; j < i + 1; j++)
				System.out.printf("*");
			System.out.println();
		}

	}
}
