public class FactorialOfANumber {
    // long = to handle overflow(up to 20 only)
    public static long factorialOfANum(int n) {
        if(n < 0) return -1;
        if (n <= 1)
        return 1;
        return n * factorialOfANum(n-1);
    }
    public static void main(String[] args) {
        long fact = factorialOfANum(8);
        System.out.println(fact);
    }
}
