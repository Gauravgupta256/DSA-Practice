public class Pattern11 {
    public static void main(String[] args) {
        // N = 5
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        int N = 5;
        System.out.println("PATTERN-11");
        for(int i=1; i<=N; i++) {
            int start = (i%2 == 0) ? 0 : 1;
            for(int j=1; j<=i; j++) {
                   System.out.print(start+" ");
                   start = 1 - start; //toggle
            }
            System.out.println();
        }

        // OR
        // for(int i=1; i<=N; i++) {
        //     for(int j=1; j<=i; j++) {
        //         if((i+j)%2== 0) {
        //             System.out.print(1+" ");
        //         } else {
        //             System.out.print(0+" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}