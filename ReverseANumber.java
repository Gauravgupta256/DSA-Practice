public class ReverseANumber {
    public static void reverseNumber(int n) {
        int reversedNumber = 0;
        while(n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber*10 + digit;
            n /= 10;
        }
        System.out.println(reversedNumber);
    }
    public static void main(String[] args) {
        int n = 46853;
        reverseNumber(n);
    }
}
