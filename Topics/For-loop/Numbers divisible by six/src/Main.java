import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i=0; i < count; i++) {
            int temp = scanner.nextInt();
            sum += (temp % 6 == 0 ? temp : 0);
        }
        System.out.println(sum);
    }
}