import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true) {
            int cur = scanner.nextInt();
            total += cur;
            if (cur == 0) {
                break;
            } else if (total >= 1000) {
                total -= 1000;
                break;
            }
        }
        System.out.println(total);
    }
}