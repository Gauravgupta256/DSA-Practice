public class Pattern2 {
    public static void main(String[] args) {
        // N = 5
        // * 
        // * * 
        // * * *
        // * * * * 
        // * * * * *
        int N = 5;
        System.out.println("PATTERN-2");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}