public class CheckIfArraySorted {
    public static boolean isArraySorted(int[] arr) {
         int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8};
        System.out.println(isArraySorted(arr));
    }
}
