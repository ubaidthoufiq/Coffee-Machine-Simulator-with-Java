import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows for the pyramid
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}