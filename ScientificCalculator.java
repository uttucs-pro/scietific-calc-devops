import java.util.Scanner;

public class ScientificCalculator {

    // ── Square Root ──────────────────────────────────────────────
    public static double squareRoot(double x) {
        if (x < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(x);
    }

    // ── Factorial ────────────────────────────────────────────────
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ── Natural Logarithm (ln) ───────────────────────────────────
    public static double naturalLog(double x) {
        if (x <= 0) {
            System.out.println("Error: Natural logarithm is not defined for zero or negative numbers.");
            return Double.NaN;
        }
        return Math.log(x);
    }

    // ── Power Function (x^b) ────────────────────────────────────
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // ── Display Menu ─────────────────────────────────────────────
    public static void displayMenu() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║     SCIENTIFIC CALCULATOR            ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  1. Square Root       (√x)          ║");
        System.out.println("║  2. Factorial         (x!)           ║");
        System.out.println("║  3. Natural Logarithm (ln x)        ║");
        System.out.println("║  4. Power Function    (x^b)         ║");
        System.out.println("║  5. Exit                             ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("Enter your choice (1-5): ");
    }

    // ── Main ─────────────────────────────────────────────────────
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Scientific Calculator!");

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {

                case 1: // Square Root
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    double sqrtResult = squareRoot(sqrtInput);
                    if (!Double.isNaN(sqrtResult)) {
                        System.out.printf("√%.4f = %.4f%n", sqrtInput, sqrtResult);
                    }
                    break;

                case 2: // Factorial
                    System.out.print("Enter a non-negative integer: ");
                    int factInput = scanner.nextInt();
                    long factResult = factorial(factInput);
                    if (factResult != -1) {
                        System.out.printf("%d! = %d%n", factInput, factResult);
                    }
                    break;

                case 3: // Natural Logarithm
                    System.out.print("Enter a positive number: ");
                    double lnInput = scanner.nextDouble();
                    double lnResult = naturalLog(lnInput);
                    if (!Double.isNaN(lnResult)) {
                        System.out.printf("ln(%.4f) = %.4f%n", lnInput, lnResult);
                    }
                    break;

                case 4: // Power Function
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    double powResult = power(base, exponent);
                    System.out.printf("%.4f ^ %.4f = %.4f%n", base, exponent, powResult);
                    break;

                case 5: // Exit
                    running = false;
                    System.out.println("Thank you for using the Scientific Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }
}

