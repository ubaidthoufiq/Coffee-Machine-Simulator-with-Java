import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisor = scanner.nextInt();
        int result = (end/divisor) - (start/divisor);
        if (start % divisor == 0) {
            result += 1;
        }
        System.out.println(result);
    }
}