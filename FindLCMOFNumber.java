public class FindLCMOFNumber {
    public static int lcmM1(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0)
                return max;
            max++;
        }
    }

    // Function to find GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Function to find LCM
    public static int lcmM2(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        int n1 = 3, n2 = 5;
        System.out.println("LCM of "+n1+" and "+n2);
        System.out.println(lcmM2(n1, n2));
    }
}
