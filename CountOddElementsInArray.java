public class CountOddElementsInArray {
    public static int countOddInArray(int[] arr) {
        int n = arr.length;
        if(n==0) return 0;
        int oddCount = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]%2 != 0) oddCount++;
        }
        return oddCount;
    } 
    public static void main(String[] args) {
        int[] arr = {2,4,9,7,1,6,9,7,9,4};
        System.out.println(countOddInArray(arr));
    }
}
