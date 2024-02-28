import java.util.Scanner; // import necessary method for input handling

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object for getting user input

        // read the first and second numbers and store them into variables
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}