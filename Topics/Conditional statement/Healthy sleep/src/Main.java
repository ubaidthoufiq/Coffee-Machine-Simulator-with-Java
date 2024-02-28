import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        int ann = scanner.nextInt();
        if (low <= ann && ann <= high) {
            System.out.println("Normal");
        } else if (ann > high) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
    }
}