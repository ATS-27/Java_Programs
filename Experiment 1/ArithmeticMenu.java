import java.util.Scanner;

public class ArithmeticMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getValidMenuChoice(scanner);

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();
        }

        scanner.close();
    }

    // Displays menu
    private static void displayMenu() {
        System.out.println("===== Arithmetic Menu =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // Validates menu input
    private static int getValidMenuChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number (1–5): ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Reads valid number input
    private static double getValidNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid number. Try again: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static void performAddition(Scanner scanner) {
        double a = getValidNumber(scanner, "Enter first number: ");
        double b = getValidNumber(scanner, "Enter second number: ");
        System.out.println("Result: " + (a + b));
    }

    private static void performSubtraction(Scanner scanner) {
        double a = getValidNumber(scanner, "Enter first number: ");
        double b = getValidNumber(scanner, "Enter second number: ");
        System.out.println("Result: " + (a - b));
    }

    private static void performMultiplication(Scanner scanner) {
        double a = getValidNumber(scanner, "Enter first number: ");
        double b = getValidNumber(scanner, "Enter second number: ");
        System.out.println("Result: " + (a * b));
    }

    private static void performDivision(Scanner scanner) {
        double a = getValidNumber(scanner, "Enter numerator: ");
        double b;

        while (true) {
            b = getValidNumber(scanner, "Enter denominator: ");
            if (b != 0) break;
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Result: " + (a / b));
    }
}
