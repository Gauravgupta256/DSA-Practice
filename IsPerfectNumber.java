public class IsPerfectNumber {
    // Perfect Number 
    // n = 6
    // proper divisor = 1, 2, 3
    // sum = 1 + 2 + 3 = 6 (number itself)
    public static boolean isPerfectNumber(int n) {
        int original = n;
        int sum = 1;
        for(int i=2; i*i<n; i++) {
            if(n%i == 0){
                sum += i;
                if(i != (n/i)) sum += (n/i);
            }
        }
        return sum == original;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
