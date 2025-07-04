import java.util.Scanner;

public class ThreeDigitEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt(); // Example number
        if (num >= 100 && num <= 999) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;

            if (hundreds == tens && tens == units || hundreds == units) {
                System.out.println("All digits are equal.");
            } else if (hundreds == tens || tens == units ) {
                System.out.println(" Two Digits are Same.");
            }
        } else {
            System.out.println("Number is not a three-digit number.");
        }
    }

}