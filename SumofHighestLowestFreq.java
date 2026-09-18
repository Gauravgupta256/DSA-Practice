import java.util.HashMap;
import java.util.Map;

public class SumofHighestLowestFreq {

    public static int sumOfHighestAndLowestFreqElements(int[] arr, int n) {
        if (n == 0)
            return 0;

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }

        return maxFreq + minFreq;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        System.out.println(sumOfHighestAndLowestFreqElements(nums, 6)); // Output: 4
    }
}