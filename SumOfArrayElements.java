public class SumOfArrayElements {
    public static int sumOfArrayElements(int[] arr) {
        if(arr.length == 0) return 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) sum += arr[i];
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {8,6,4,6,7,9,4,0};
        System.out.println(sumOfArrayElements(arr));
    }
}
