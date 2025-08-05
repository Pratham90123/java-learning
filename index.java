import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Take second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Take operator
        System.out.println("Choose one operator: add, sub, mul, div");
        String op = scanner.next();  // Fixed: removed pattern

        // Perform operation
        if (op.equals("add")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (op.equals("sub")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (op.equals("mul")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (op.equals("div")) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}
