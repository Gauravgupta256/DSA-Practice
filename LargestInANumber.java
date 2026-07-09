public class LargestInANumber {
    public static int largestNumInANumber(int n) {
        if(n==0 || n < 0) return n;
        int largest = 0;
        while(n > 0) {
            largest = Math.max(largest, n %10);
            n /= 10;
        }
        return largest;
    }

    public static void main(String[] args) {
        int num = 846513;
        int ans = largestNumInANumber(num);
        System.out.println(ans);
    }
}
