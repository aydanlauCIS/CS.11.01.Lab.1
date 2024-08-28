import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        // Take input
        Scanner ageScanner = new Scanner(System.in);

        // Repeat until integer input
        int age;
        while (true) {
            System.out.print("Enter your age: ");
            try {
                age = Integer.parseInt(ageScanner.nextLine());
                if (age < 0) {
                    System.out.println("Age has to be positive.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer.");
            }
        }

        // Calculate result
        int page = 100 - age;
        System.out.println(age + "-year olds should read at least " + page + " pages before giving up on a book.");
    }
}
