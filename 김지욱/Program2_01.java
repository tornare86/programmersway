package Program;

import java.util.Scanner;

public class Program2_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x���� �Է��ϼ���-> ");
		String x_= scan.nextLine();
		scan.close();
		int x = Integer.parseInt(x_);
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) 
				System.out.printf("*");
			
			System.out.printf("\n");
		}
	}

}