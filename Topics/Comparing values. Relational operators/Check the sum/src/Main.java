import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean res = (n1 + n2 == 20) || (n2 + n3 == 20) || (n3 + n1 == 20);
        System.out.println(res);
    }
}