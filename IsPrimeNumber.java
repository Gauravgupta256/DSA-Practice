public class IsPrimeNumber {
    public static boolean isPrimeNumber(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));
    }
}
