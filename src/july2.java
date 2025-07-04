import java.util.Scanner;

public class july2 {

    public void add(int e, int r) {
        int c = e + r;
        System.out.println("Addition: " + c);
    }

    public void subtract(int e, int r) {
        int d = e - r;
        System.out.println("Subtraction: " + d);
    }

    public void multiply(int e, int r) {
        int f = e * r;
        System.out.println("Multiplication: " + f);
    }

    public void division(int e, int r) {
        if (r == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int g = e / r;
            System.out.println("Division: " + g);
        }
    }

    public static void main(String[] args) {
        july2 obj = new july2();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        obj.add(a, b);
        obj.subtract(a, b);
        obj.multiply(a, b);
        obj.division(a, b);

        sc.close();
    }
}
