package Program;

import java.util.Scanner;

public class Program1_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x���� �Է��ϼ���-> ");
		String x_ = scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);
		int n = 21;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.printf("%2d ", n);
				n++;
			}
			n=n-10;
			System.out.printf("\n");
		}

	}

}
