public class Pattern22 {
    public static void main(String[] args) {
        // N = 4
        // 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4
        System.out.println("PATTERN-22");
        System.out.println();
        int N = 4;
        int size = 2 * N - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print((N - min) + " ");
            }

            System.out.println();
        }
    }
}