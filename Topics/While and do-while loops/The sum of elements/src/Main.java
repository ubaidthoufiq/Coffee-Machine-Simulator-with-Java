import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true) {
            int curr = scanner.nextInt();
            if (curr != 0) {
                total += curr;
            } else {
                break;
            }
        }
        System.out.println(total);
    }
}