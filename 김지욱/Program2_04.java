package Program;

import java.io.IOException;
import java.util.Scanner;

public class Program2_04 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("num값을 입력하세요-> ");
		String x_= scan.nextLine();
		scan.close();
		int num = Integer.parseInt(x_);
		
		for(int i=0;i<num;i++) {
			for(int k=0;k<num-i-1;k++) 
				System.out.print(" ");
			
			for(int j=0;j<=i;j++) 
				System.out.print("*");
			
			for(int n=0;n<=i-1;n++) 
				System.out.print("*");
			
			System.out.println();
		}
	}
}