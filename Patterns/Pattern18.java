public class Pattern18 {
    public static void main(String[] args) {
        // N = 5;
        // E
        // D E
        // C D E
        // B C D E
        // A B C D E
        int N = 5;
        System.out.println("PATTERN-18");
        System.out.println();
        for(int i=1; i<=N; i++) {
            char start = (char)('A' + (N - i));
            char end = (char)('A' + N - 1);

            for(char ch = start; ch <= end; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
           
        }

    }
}
