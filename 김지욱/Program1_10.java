package Program;

import java.io.IOException;
import java.util.Scanner;

public class Program1_10 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값을 입력하세요-> ");
		String x_ = scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);
		int n = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i -1; j++) {
				System.out.printf("   ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.printf("%2d ", n);
				n++;
			}
			System.out.printf("\n");
		}
	}
}