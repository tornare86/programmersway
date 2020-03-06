package Program;

import java.util.Scanner;

public class Program2_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값을 입력하세요-> ");
		String x_ = scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);

		for (int i = 0; i < x; i++) {
			for (int k = 0; k < x - i - 1; k++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}

	}

}
