package PDF;

public class Program2_08 {

	public static void main(String[] args) {

		int x = 5;

		// [08]
		System.out.print("式式式式式式式式式[08]式式式式式式式式式\n");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 14; j++)
				System.out.print(" ");
			for (int j = 0; j < x - i; j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i + 1; j++)
				System.out.print("*");
			for (int j = 0; j < x - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < x - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			for (int j = 0; j < 11; j++)
				System.out.print("*");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			for (int j = 0; j < x - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < x - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
