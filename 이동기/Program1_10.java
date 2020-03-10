package RoadOfJava;

public class Program1_10 {

	public static void main(String[] args) {
		int n = 5;
/*		
		for(int i =0; i<n; i++) {
			for(int j = 0; j<=n; j++) {
				System.out.printf("%3d",(i+j)%n+1);
			}
		System.out.println();
		}
*/
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print("   ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.printf("%2d ",i*(i-1)/2+j);
			}
		System.out.println();
		}

	}

}
