import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fh = scanner.nextInt();
        int fm = scanner.nextInt();
        int fs = scanner.nextInt();
        int sh = scanner.nextInt();
        int sm = scanner.nextInt();
        int ss = scanner.nextInt();

        System.out.println((sh-fh)*3600 + (sm-fm)*60 + ss-fs);
    }
}