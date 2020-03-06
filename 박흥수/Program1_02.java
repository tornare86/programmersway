public class Program1_02 {
    public static void main(String[] arguments) {
        int x = 5;

        // [02]
        System.out.println();
        System.out.print("─────[02]─────\n");
        int num = 0;
        for (int j = 0; j < x; j++) {
            num = 20 - 5 * j;
            for (int i = 0; i < x; i++)
                System.out.printf("%2d ", ++num);
            System.out.println();
        }
    }
}