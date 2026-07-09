import java.util.ArrayList;
import java.util.Collections;

public class DivisorsOfANumber {
    public static ArrayList<Integer> divisors(int n) { //TC = O(N)
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                ans.add(i);
            }
        }
        return ans;
    } 

     public static ArrayList<Integer> divisors2(int n) { //TC = O(√n)
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(divisors2(8));
    }
}
