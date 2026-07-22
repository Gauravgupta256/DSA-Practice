import java.util.HashMap;

public class MaxFreqElementInArray {
    public static int maxFreqElementInArray(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int num : arr) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0, ans = arr[0];
        for(int i: temp.keySet()) {
            if(temp.get(i) > maxFreq){
                maxFreq = temp.get(i);
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,4,5,1,5,2,5,6,3,6,4,8,14};
        System.out.println(maxFreqElementInArray(arr));
    }
}
