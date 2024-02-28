import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((-15 < num && num <= 12) || (14 < num && num < 17) || (19 <= num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}