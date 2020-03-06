public class Program1_01 {
    public static void main(String[] arguments) {
        int x = 5;

        // [01]
        System.out.print("─────[01]─────\n");
        int num = 0;
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x; i++)
                System.out.printf("%2d ", ++num);
            System.out.println();
        }
    }
}