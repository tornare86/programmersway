package Program;

import java.io.IOException;
import java.util.Scanner;

public class Program1_01 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("x���� �Է��ϼ���-> ");
		String x_ = scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);
		int n = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.printf("%2d ", n);
				n++;
			} 
			System.out.printf("\n");
		}
	}
}