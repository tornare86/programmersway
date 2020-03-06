public class Program1_03 {
    public static void main(String[] arguments) {
        int x = 5;

        // [03]
        System.out.println();
        System.out.print("─────[03]─────\n");

        int num = -1;
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x; i++)
                System.out.printf("%2d ", num += 2);
            System.out.println();
        }
    }
}