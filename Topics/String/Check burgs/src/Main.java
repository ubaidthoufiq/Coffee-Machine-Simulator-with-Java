import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.endsWith("burg")){
            System.out.println("true");
        } else {
            System.out.println("false");;
        }
    }
}