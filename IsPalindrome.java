public class IsPalindrome {
    public static boolean isPalindrome(int n) {
        if(n < 0) return false;
        int original = n;
        int reversed = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reversed = reversed*10 + lastDigit;
            n /= 10;
        }
        return original == reversed;
    }
    // M-2 : Reversing only half and compare to other half
    public static boolean isPalindrome2(int n) {

    if (n < 0 || (n % 10 == 0 && n != 0))
        return false;

    int reversedHalf = 0;

    while (n > reversedHalf) {
        reversedHalf = reversedHalf * 10 + n % 10;
        n /= 10;
    }

    return n == reversedHalf || n == reversedHalf / 10;
}
    public static void main(String[] args) {
        int num = 458854;
        System.out.println(isPalindrome2(num));
    }
}
