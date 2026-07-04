public class Pattern4 {
    public static void main(String[] args) {
        // N = 5
        // 1 
        // 2 2 
        // 3 3 3
        // 4 4 4 4 
        // 5 5 5 5 5
        int N = 5;
        System.out.println("PATTERN-4");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    
}