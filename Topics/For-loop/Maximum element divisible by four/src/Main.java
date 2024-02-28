import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int curMax = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        while (n > 0) {
            int i = scanner.nextInt();
            if (i > curMax && i % 4 == 0) {
                curMax = i;
            }
            n--;
        }
        System.out.println(curMax);
    }
}