package week00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1_02 {

	public static void main(String[] args) throws Exception, IOException {
		int number;
		int b = 0;

		System.out.print("number = ");
		BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
		number = Integer.parseInt(inputNum.readLine());

		for (int i = 0; i < number; i++) {
			b = number * (number - 1) - number * i;
			for (int j = 0; j < number; j++) {
				System.out.printf("%2d ", ++b);
			}
			System.out.println();
		}
	}

}
