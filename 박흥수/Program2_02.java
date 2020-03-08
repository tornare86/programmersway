package PDF;

public class Program2_02 {

	public static void main(String[] args) {

		int n = 5;

		// [02]
		System.out.print("2-1) number = 5\n");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.printf("*");
			System.out.println();
		}

	}
}
