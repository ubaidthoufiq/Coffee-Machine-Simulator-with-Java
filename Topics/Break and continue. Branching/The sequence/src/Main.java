import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int cur = 1;
        outerloop:
        while (true) {
            int my_cur = cur;
            while (my_cur > 0) {
                System.out.print(cur + " ");
                count--;
                my_cur--;
                if (count==0) {
                    break outerloop;
                }
            }
            cur++;
        }
    }
}