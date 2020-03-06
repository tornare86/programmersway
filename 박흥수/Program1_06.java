public class Program1_06 {
    public static void main(String[] arguments) {
        int x = 5;

        // [06]
        System.out.println();
        System.out.print("─────[06]─────\n");
        int num = 0;
        for (int j = 0; j < x; j++) {
            num = 0;
            for (int i = 0; i < x - j; i++)
                System.out.printf("%2d ", ++num);
            System.out.println();
        }
    }
}