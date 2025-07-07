import java.util.Scanner;

public class July7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Level (1 to 4): ");
        int level = sc.nextInt();

        double basic = 0;
        double allowancePercent = 0;
        double totalSalary = 0;

        switch(level) {
            case 1:
                basic = 50000;
                allowancePercent = 32;
                break;
            case 2:
                basic = 40000;
                allowancePercent = 25;
                break;
            case 3:
                basic = 30000;
                allowancePercent = 20;
                break;
            case 4:
                basic = 20000;
                allowancePercent = 15;
                break;
            default:
                System.out.println("Invalid level! Please enter between 1 and 4.");
                return;
        }

        double allowance = (basic * allowancePercent) / 100;
        totalSalary = basic + allowance;

        System.out.println("Basic Salary: ₹" + basic);
        System.out.println("Allowance: ₹" + allowance);
        System.out.println("Total Salary: ₹" + totalSalary);
    }
}
