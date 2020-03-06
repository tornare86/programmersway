public class Program1_10 {
    public static void main(String[] arguments) {
        int x = 5;

        // [10]
        System.out.println();
        System.out.print("─────[10]─────\n");

        int num = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%2d ", ++num);
            }
            System.out.println();
        }
    }
}