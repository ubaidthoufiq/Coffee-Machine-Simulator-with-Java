import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        double a;
        double b;
        double c;
        double r;
        switch (value) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c)/2;
                double tri_area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println(tri_area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double rect_area = a * b;
                System.out.println(rect_area);
                break;
            case "circle":
                r = scanner.nextDouble();
                double cir_area = 3.14 * r * r;
                System.out.println(cir_area);
                break;
            default:
                System.out.println("Invalid shape name.");
        }
    }
}