public class IsArmstrong {
    public static boolean isArmstrongNumber(int n) {
        if (n < 0) return false;
        int original = n;
        // Count digits
        // int digits = 0;
        // int temp = n;

        // while (temp > 0) {
        //     digits++;
        //     temp /= 10;
        // }

        // if (n == 0)
        //     digits = 1;

        // // Calculate Armstrong sum
        // int sum = 0;

        // while (n > 0) {
        //     int digit = n % 10;
        //     sum += (int) Math.pow(digit, digits);
        //     n /= 10;
        // }

        // return sum == original;
        int digits = numOfDigits(n);
        int sum = powerAndSum(n, digits);
        return sum == original;
    }

    public static int numOfDigits(int n) {
       if (n == 0)
            return 1;
        int numOfDigits = 0;
        while (n > 0) {
            numOfDigits++;
            n /= 10;
        }
        return numOfDigits;
    }
    public static int powerAndSum(int n, int digits) {
         int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += (int) Math.pow(digit, digits);

            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
}
