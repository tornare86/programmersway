package RoadOfJava;

public class Program1_01 {

	public static void main(String[] args) {
		//p.18 Chapter 4. ù��° ���� ����
		//if���̳� �迭�� ������� �ʽ��ϴ�.
		//������ ���� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
