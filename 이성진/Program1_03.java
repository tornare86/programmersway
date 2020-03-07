package programmersway;

public class Program1_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1    3    5    7    9
//
//		11   13   15   17   19
//
//		21   23   25   27   29
//
//		31   33   35   37   39
//
//		41   43   45   47   49
		int num = -1;
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				System.out.printf("%2d ", num+2);{
				num += 2;
				}
			}
			System.out.println();
		}
	}
}
