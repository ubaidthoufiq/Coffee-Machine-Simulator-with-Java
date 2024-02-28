import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myWord = scanner.nextLine().toUpperCase();
        System.out.println(myWord.startsWith("J"));
    }
}
