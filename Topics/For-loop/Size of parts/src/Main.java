import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int ready = 0;
        int fixed = 0;
        int reject = 0;

        while (count > 0) {
            int cur = scanner.nextInt();
            if (cur == 0) {
                ready++;
            } else if (cur == 1) {
                fixed++;
            } else {
                reject++;
            }
            count--;
        }
        System.out.println(ready + " " + fixed + " " + reject);
    }
}