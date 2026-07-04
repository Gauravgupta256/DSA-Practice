public class Pattern3 {
    public static void main(String[] args) {
        // N = 5
        // 1 
        // 1 2 
        // 1 2 3
        // 1 2 3 4 
        // 1 2 3 4 5
        int N = 5;
        System.out.println("PATTERN-3");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}