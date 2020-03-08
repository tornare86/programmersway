package PDF;

public class Program1_07 {

	public static void main(String[] args) {

		int n = 5;

		// [07]
		System.out.print("1-7) number = 5\n");
		System.out.println();

		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.printf("%2d ", ++num);
			System.out.println();
		}

	}
}
