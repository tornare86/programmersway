package week00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number;
		int b = 0;
		System.out.print("number = ");
		BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
		number = Integer.parseInt(inputNum.readLine());
		
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number - i - 1; j++) {
				System.out.print("   ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.printf("%2d ", ++b);
			}
			System.out.println();
		}

	}

}
