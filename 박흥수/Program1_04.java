public class Program1_04 {
    public static void main(String[] arguments) {
        int x = 5;

        // [04]
        System.out.println();
        System.out.print("─────[04]─────\n");

        for (int j = 0; j < x; j++) {
            for (int i = 0; i < j + 1; i++)
                System.out.printf("%2d ", i + 1);
            System.out.println();
        }
    }
}