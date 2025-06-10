import java.util.Scanner;

public class simpleCalculator {
// a simple user friendly calculator that can perform addition, subtraction, multiplication, and division. The calculator should be able to handle both positive and negative numbers.
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Float.NaN;
        }
        return (float) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nEnter first value: ");
            int a = sc.nextInt();
            System.out.println("Enter second value: ");
            int b = sc.nextInt();

            System.out.println("Enter the operation you want to perform (add, subtract, multiply, divide) or 'exit' to quit:");
            String op = sc.next().toLowerCase();
            
            if (op.equals("exit")) {
                System.out.println("Exiting calculator. Thanks for using calculator!");
                break; 
            }

            switch (op) {
                case "add":
                    System.out.println("Result: " + add(a, b));
                    break;
                case "subtract":
                    System.out.println("Result: " + subtract(a, b));
                    break;
                case "multiply":
                    System.out.println("Result: " + multiply(a, b));
                    break;
                case "divide":
                    System.out.println("Result: " + divide(a, b));
                    break;
                default:
                    System.out.println("Choose a valid operation!");
            }
        }
        sc.close();
    }
}