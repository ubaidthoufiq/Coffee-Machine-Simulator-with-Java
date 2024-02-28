import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int max_cur = Integer.MIN_VALUE;
        while (iterations > 0) {
            int curr = scanner.nextInt();
            max_cur = curr % 4 == 0 && curr > max_cur ? curr : max_cur;
            iterations -= 1;
        }
        System.out.println(max_cur);
    }
}