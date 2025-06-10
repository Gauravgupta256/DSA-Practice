class findLargest {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6, 5,1,64,31,645,61,64,64,31,645,31,644,31,8};
        int temp = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println("Maximum element of the array is : "+temp);
    }
}