public class FindGCDOfANumber {
    // GCD = Greatest Common Divisor of Both numbers
    // n1 = 4, n2 = 6
    // n1's divisor = 1, 2, 4
    // n2's divisor = 1, 2, 3, 6
    // GCD(4, 6) = 2
    public static int gcdMethod1(int n1, int n2) { // TC = O(min(n1, n2))
        if(n1==0) return n2;
        if(n2==0) return n1;
        int gcd = 1;
        for(int i=2;i<(int)Math.min(n1, n2); i++) {
            if(n1%i == 0 && n2%i == 0) gcd = i;
        }
        return gcd;
    }

    public static int gcdMethod2(int n1, int n2) {
       //Euclidean Algorithm, TC = O(log(min(a, b)))
       return (n2 == 0) ? n1 : gcdMethod2(n2, n1%n2);
        
    }
    public static void main(String[] args) {
        int a=4, b=0;
        int gcd1 = gcdMethod2(a, b);
        System.out.println("GCD of "+a+" and "+b +" :");
        System.out.println(gcd1);
    }
}
