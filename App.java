import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Clear buffer
        input.nextLine();

        // Ask for favourite programming language
        System.out.print("Enter your favourite programming language: ");
        String language = input.nextLine();

        // Ask for study hours
        System.out.print("Enter your study hours per week: ");
        double studyHours = input.nextDouble();

        // Boolean logic
        boolean isAdult = age >= 18;

        // Call greeting method
        greetStudent(name);

        // Print student profile
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favourite Language: " + language);
        System.out.println("Study Hours Per Week: " + studyHours);
        System.out.println("Adult: " + isAdult);

        // Decision making
        if (studyHours >= 10) {
            System.out.println("Great study habit!");
        } else {
            System.out.println("Try to spend more time practising.");
        }

        // Loop (prints message 3 times)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Excellent! Keep it up!");
        }

        // Close scanner
        input.close();
    }

    // Method for greeting student
    public static void greetStudent(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}