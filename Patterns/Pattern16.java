public class Pattern16 {
    public static void main(String[] args) {
        // N = 5
        // A
        // B B
        // C C C
        // D D D D
        // E E E E E
        int N = 5;
        char ch = 'A';
        System.out.println("PATTERN-16");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
             ch++;
        }
    }
}
