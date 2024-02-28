import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_num = Integer.MIN_VALUE;
        while (true) {
            int temp = scanner.nextInt();
            max_num = Math.max(temp, max_num);
            if (temp == 0) {
                break;
            }
        }
        System.out.println(max_num);
    }
}