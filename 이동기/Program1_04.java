package RoadOfJava;
public class Program1_04 {

	public static void main(String[] args) {

		int n = 5;
		
		for(int i =0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.printf("%2d",(i*n*0)+(j+1));
			}
		System.out.println();
		}
	}

}
