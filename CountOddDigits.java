public class CountOddDigits {
    public static int countOddDigits(int num) {
        if(num < 0) return -1;
        int numOfOddDigits = 0;
        while(num > 0) {
            if(num %2 != 0) numOfOddDigits++;
            num /= 10;
        }
        return numOfOddDigits;
    }
    public static void main(String[] args) {
        int n = 984651;
        System.out.println(countOddDigits(n));
    }
}
