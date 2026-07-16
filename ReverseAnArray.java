public class ReverseAnArray {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,4,8};
        reverseArray(arr);
        for(int i: arr) System.out.println(i+" ");
    }
}
