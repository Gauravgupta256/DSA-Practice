public class Pattern8 {
    public static void main(String[] args) {
        // N = 5
        // * * * * * * * * *
        //   * * * * * * * 
        //     * * * * * 
        //      * * *
        //        *
        int N = 5;
        System.out.println("PATTERN-8");
        System.out.println();
        for(int i=N; i>=1; i--) {
            for(int j=1; j<=(N-i); j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
