import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        // Note: The modulus (%) operator takes the sign of the dividend (the left operand).
        // Division (/) truncates toward zero when operating on integers with negative values.
        int remainder = num1 % num2;

        System.out.println("Addition (+): " + sum);
        System.out.println("Subtraction (-): " + difference);
        System.out.println("Multiplication (*): " + product);
        System.out.println("Division (/): " + quotient);
        System.out.println("Modulus (%): " + remainder);

        scanner.close();
    }
}
