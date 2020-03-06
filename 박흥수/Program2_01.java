public class Program2_01 {
    public static void main(String[] arguments) {
        int x = 5;

        // [01]
        System.out.print("──────[01]──────\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++)
                System.out.print(" ");
            for (int j = 0; j < x; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}