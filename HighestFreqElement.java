import java.util.HashMap;
import java.util.Map;

public class HighestFreqElement {
    // find the most freq element that appears max, if more than one appears same time then return the smallest one element
    // eg. nums = [1,2,2,3,3,3] ans = 3
    // eg. nums = [4, 4 ,5, 5 ,6] ans = 4
    public static int mostFreqElement(int[] nums) {
        HashMap<Integer, Integer> visi = new HashMap();
        for(int n : nums) {
            visi.put(n, visi.getOrDefault(n, 0) + 1);
        }

        int result = Integer.MAX_VALUE;
        int maxFreq = 0;

        for(Map.Entry<Integer, Integer> entry : visi.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq || (freq == maxFreq && num < result)) {
                maxFreq = freq;
                result = num;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        System.out.println(mostFreqElement(nums1)); // expected 3

        int[] nums2 = {10,9,8};
        System.out.println(mostFreqElement(nums2)); // expected 4
    }
}
