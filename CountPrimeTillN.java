public class CountPrimeTillN {
    public static int countPrimeNumberTillN(int n) {
        if (n <= 1) return -1;
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return -1;
        }
        count++;
        return count;
    }
    public static void main(String[] args) {
        int n = countPrimeNumberTillN(5);
        System.out.println(n);
    }
}
