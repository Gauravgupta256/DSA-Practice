public class CountAllDigits {
    public static int countNumOfDigits(int n) {
        if(n < 0) return -1;
        if (n == 0) return 1;

        int numOfDigits = 0;
        while(n > 0) {
            n /= 10;
            numOfDigits++;
        }
        return numOfDigits;
    }
    // M-2
    public static int countDigits(int n) {
        if (n < 0) return -1;   
        if (n == 0) return 1;   

        return (int) Math.log10(n) + 1;
    }
    public static void main(String[] args) {
        int n = 884653;
        int ans = countDigits(n);
        System.out.println(ans);
    }
}