import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = scanner.nextInt();

        x--;
        y--;
        z--;
        a--;
        System.out.println(x + " " + y + " " + z + " " + a);
    }
}