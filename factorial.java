import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    static BigInteger fact(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return BigInteger.valueOf(-1);
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid non-negative integer.");
            sc.next();
            System.out.print("Enter a non-negative integer: ");
        }

        int n = sc.nextInt();
        BigInteger result = fact(n);

        if (!result.equals(BigInteger.valueOf(-1))) {
            System.out.println("Factorial of " + n + " is " + result);
        }

        sc.close();
    }
}