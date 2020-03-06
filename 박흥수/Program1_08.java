public class Program1_08 {
    public static void main(String[] arguments) {
        int x = 5;

        // [08]
        System.out.println();
        System.out.print("─────[08]─────\n");
        int num = 0;
        for (int j = 0; j < x; j++) {
            num = j + 1;
            for (int i = 0; i < x; i++)
                System.out.printf("%2d ", num++);
            System.out.println();
        }
    }
}