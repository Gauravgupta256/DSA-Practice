public class Pattern6 {
    public static void main(String[] args) {
        // N = 5
        // 1 2 3 4 5 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        int N = 5;
        System.out.println("PATTERN-6");
        System.out.println();
        for(int i=N; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}