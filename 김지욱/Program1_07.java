package Program;

import java.util.Scanner;

public class Program1_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x���� �Է��ϼ���-> ");
		String x_ = scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);
		int n = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.printf("%2d ", n);
				n++;
			}
			System.out.printf("\n");
		}

	}

}
