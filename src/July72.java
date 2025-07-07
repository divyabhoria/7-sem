import java.util.Scanner;

public class July72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color ");
        String color = sc.nextLine().toLowerCase(); // Normalize to lowercase

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color! Please enter Red, Yellow, or Green.");
        }

}}