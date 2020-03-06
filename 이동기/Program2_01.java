package RoadOfJava;

public class Program2_01 {

	public static void main(String[] args) {
//		두번째 과제모음에서 프로그램작성시에
//		for 문과 System.out.print 문 이외에는 다른 문이나
//		함수를 사용하지 않고 프로그램을 작성하도록 하자.
		
/*		2-1) number = 5

				*****
				*****
				*****
				*****
				*****
*/
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
