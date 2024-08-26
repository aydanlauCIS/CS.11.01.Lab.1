import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        // Take input
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        // Repeat until integer input
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(ageScanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer.");
            }
        }

        // Calculate result
        int page = 100 - age;
        System.out.println(age + "-year olds should read at least " + page + " pages before giving up on a book.");
    }
}
