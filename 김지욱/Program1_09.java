package Program;

import java.util.Scanner;

public class Program1_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값을 입력하세요-> ");
		String x_ = scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);
		int n = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.printf("%d ", n);
				n++;
			}
			n = 1;
			for (int k = 0; k < i; k++) {
				System.out.printf("%d ", n);
				n++;
			}
			n = i + 2;
			System.out.printf("\n");
		}
	}
}