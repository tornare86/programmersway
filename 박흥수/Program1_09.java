public class Program1_09 {
    public static void main(String[] arguments) {
        // [09]
        System.out.println();
        System.out.print("──────[9]──────\n");

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++)
                System.out.printf("%2d ", (i + j) % 5 + 1);
            System.out.println();
        }
    }
}