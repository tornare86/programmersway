package RoadOfJava;

public class Program1_03 {

	public static void main(String[] args) {

		int n = 5;
		
		for(int i =0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.printf("%3d",(n*2*i)+(2*j+1));
			}
		System.out.println();
		}
	}

}
