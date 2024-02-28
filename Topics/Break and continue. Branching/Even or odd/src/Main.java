import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int cur = scanner.nextInt();
            if (cur % 2 == 1) {
                System.out.println("odd");
            } else if (cur == 0) {
                break;
            } else {
                System.out.println("even");
            }
        }
    }
}