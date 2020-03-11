package test;

import java.util.Scanner;

public class Program2_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("num값을 입력하세요-> ");
		String x_ = scan.nextLine();
		scan.close();
		int num = Integer.parseInt(x_);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i - 1; j++)
				System.out.print(" ");

			for (int j = 0; j <= 2 * i; j++)
				System.out.print("*");

			System.out.println();
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" ");

			for (int j = 0; j < 2 * num - (2 * i + 1) - 2; j++)
				System.out.print("*");

			System.out.println();
		}

	}
}
