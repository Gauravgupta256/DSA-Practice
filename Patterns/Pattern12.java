public class Pattern12 {
    public static void main(String[] args) {
        // N = 5
        // 1                 1
        // 1 2             2 1
        // 1 2 3         3 2 1
        // 1 2 3 4     4 3 2 1 
        // 1 2 3 4 5 5 4 3 2 1
        int N = 5;
        System.out.println("PATTERN-12");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
                for(int k=1; k<=(2*(N-i)); k++) {
                    System.out.print(" ");
                
            }
            for(int s=i; s>=1; s--) {
                    System.out.print(s);
                }
                
            System.out.println();
        }
    }
}
