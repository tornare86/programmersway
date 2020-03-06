package PDF;

public class Program2_10 {

	public static void main(String[] args) {

		int x = 5;

		// [10]
		System.out.print("式式式式式式式式式[10]式式式式式式式式式\n");
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < j + 1; i++)
				System.out.print("*");
			System.out.println();
		}

		for (int j = 0; j < x; j++) {
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			for (int i = 0; i < j + 1; i++)
				System.out.print("@");
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			System.out.println();
		}

		for (int j = 0; j < x-1; j++) {
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			for (int i = 0; i < 4-j; i++)
				System.out.print("@");
			for (int i = 0; i < 1; i++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 2 - j; i++)
				System.out.print("*");
			System.out.println();
		}
	}
}
