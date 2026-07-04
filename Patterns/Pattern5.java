public class Pattern5 {
    public static void main(String[] args) {
        // N = 5
        // * * * * *  
        // * * * *
        // * * *
        // * * 
        // *
        int N = 5;
        System.out.println("PATTERN-5");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=i; j<=N; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}