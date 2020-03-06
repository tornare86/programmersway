package RoadOfJava;

public class Program1_01 {

	public static void main(String[] args) {
		//p.18 Chapter 4. 첫번째 과제 모음
		//if문이나 배열을 사용하지 않습니다.
		//임의의 값에 따른 결과를 출력하는 프로그램을 작성하시오.
		//number = 5

		/*		1-1) number = 5

				1    2    3    4    5
				6    7    8    9   10
				11   12   13   14   15
				16   17   18   19   20
				21   22   23   24   25
*/	
		int n = 5;
		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", k++);
			}
			System.out.print("\n");
		}
	}

}
