import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2, 4, 3:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}