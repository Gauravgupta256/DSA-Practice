public class Pattern21 {
    public static void main(String[] args) {
        // N = 5
        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
        int N = 5;
        System.out.println("PATTERN-21");
        System.out.println();
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {

                // Boundary condition
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

}
