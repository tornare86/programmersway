public class Program1_07 {
	public static void main(String[] args) {
		// fail
		int n = 5;
/*		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("%2d ", num++);
			}
			System.out.println();
		}
*/		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+1 - i; j++) {
				System.out.printf("%2d ",  (n*i)  - (i*(i-1)/2) + (j+i-6));
			}
			System.out.println();
		}
	}
}
