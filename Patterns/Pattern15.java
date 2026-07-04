public class Pattern15 {
    public static void main(String[] args) {
        // N = 5
        // A B C D E
        // A B C D 
        // A B C
        // A B 
        // A 
        int N = 5;
        System.out.println("PATTERN-15");
        System.out.println();
        for(int i=1; i<=N; i++) {
            char ch = 'A';
            for(int j=i; j<=N; j++) {
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
}
