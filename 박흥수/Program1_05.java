public class Program1_05 {
    public static void main(String[] arguments) {
        int x = 5;

        // [05]
        System.out.println();
        System.out.print("─────[05]─────\n");

        int num = 0;
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < j + 1; i++)
                System.out.printf("%2d ", ++num);
            System.out.println();
        }
    }
}