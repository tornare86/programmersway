package PDF;

public class Program2_09 {

	public static void main(String[] args) {

		int x = 5;

		// [09]
		System.out.print("式式式式式式式式式[09]式式式式式式式式式\n");
		for (int j = 0; j < 7; j++)
			System.out.print("$");
		System.out.println();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 1; j++)
				System.out.print("$");
			for (int j = 0; j < 5; j++)
				System.out.print("*");
			for (int j = 0; j < 1; j++)
				System.out.print("$");
			System.out.println();
		}
		for (int j = 0; j < 7; j++)
			System.out.print("$");
		System.out.println();
	}
}
