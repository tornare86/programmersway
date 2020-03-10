package RoadOfJava;

public class Program1_01 {

	public static void main(String[] args) {
		
		//number = 5;
		int n = 5;
		
		for(int i =0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.printf("%3d",i*n+j+1);
			}
		System.out.println();
		}
	}
}
