public class Pattern10 {
    public static void main(String[] args) {
        // N = 5
        // * 
        // * * 
        // * * *
        // * * * * 
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        int N = 5;
        System.out.println("PATTERN-2");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=N-1; i++) {
            for(int j=i; j<=N-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
