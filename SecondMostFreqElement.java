import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SecondMostFreqElement {
    // find second most frequent element, if more than one element appears at same second most times then return the smallest one

    public static int secondMostFreqElement(int[] arr) {
        HashMap<Integer, Integer> visi = new HashMap<>();
        for (int n : arr) {
            visi.put(n, visi.getOrDefault(n, 0) + 1);
        }

        int maxFreq = 0;
        for (int f : visi.values()) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }

        int secondMaxFreq = Integer.MIN_VALUE;
        for (int f : visi.values()) {
            if (f < maxFreq && f > secondMaxFreq) {
                secondMaxFreq = f;
            }
        }

        if (secondMaxFreq == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second most element exists");
        }

        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : visi.entrySet()) {
            if (entry.getValue() == secondMaxFreq && entry.getKey() < ans) {
                ans = entry.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        System.out.println(secondMostFreqElement(nums1)); // expected 2

        int[] nums2 = {4, 4, 5, 5, 6};
        System.out.println(secondMostFreqElement(nums2)); // expected 6
    }
}