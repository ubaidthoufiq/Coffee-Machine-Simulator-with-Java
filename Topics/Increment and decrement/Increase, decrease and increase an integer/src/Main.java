import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // read the integer from the input
        int inputInteger = inputScanner.nextInt();

        inputInteger += 1;
        inputInteger -= 2;
        inputInteger += 3;

        System.out.println(inputInteger);
    }
}