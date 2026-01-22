public class Task4 {

    // Utility method to print line
    static void printLine() {
        System.out.println("--------------------------------");
    }

    // Addition (Method Overloading)
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    // Division with Exception Handling
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    // Method to demonstrate pass-by-value
    static void changeValue(int x) {
        x = 100; // This will not affect original variable
        System.out.println("Inside method, x = " + x);
    }

    public static void main(String[] args) {

        printLine();
        System.out.println("Testing Calculator Methods");
        printLine();

        // Testing int operations
        int a = 20, b = 10;

        System.out.println("Add(int): " + add(a, b));
        System.out.println("Subtract(int): " + subtract(a, b));
        System.out.println("Multiply(int): " + multiply(a, b));

        try {
            System.out.println("Divide(int): " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        printLine();

        // Testing double operations
        double x = 10.5, y = 2.5;

        System.out.println("Add(double): " + add(x, y));
        System.out.println("Subtract(double): " + subtract(x, y));
        System.out.println("Multiply(double): " + multiply(x, y));

        try {
            System.out.println("Divide(double): " + divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        printLine();

        // Testing divide by zero
        try {
            System.out.println("Divide by zero test: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        printLine();

        // Pass-by-value demonstration
        int num = 50;
        System.out.println("Before method call, num = " + num);
        changeValue(num);
        System.out.println("After method call, num = " + num);

        printLine();
        System.out.println("All methods tested successfully!");
    }
}
