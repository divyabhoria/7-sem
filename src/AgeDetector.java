public class AgeDetector {

    public static void main(String[] args) {
        int age = 25;
        String category;

        if (age >= 0 && age <= 13) {
            category = "Child";
        } else if (age > 13 && age <= 18) {
            category = "Teenager";
        } else if (age > 18 && age <= 30) {
            category = "Adult";
        } else if (age > 30) {
            category = "Old";
        } else {
            category = "Invalid Age";
        }

        switch (category) {
            case "Child":
                System.out.println("Child");
                break;
            case "Teenager":
                System.out.println("Teenager");
                break;
            case "Adult":
                System.out.println("Adult");
                break;
            case "Old":
                System.out.println("Old");
                break;
            default:
                System.out.println("Invalid Age");
                break;
        }
    }
}