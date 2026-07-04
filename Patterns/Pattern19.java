public class Pattern19 {
    public static void main(String[] args) {
        // N = 4
        // * * * * * * * *
        // * * *     * * * 
        // * *         * * 
        // *             * 
        // *             * 
        // * *         * * 
        // * * *     * * * 
        // * * * * * * * * 
        int N = 4;
        System.out.println("PATTERN-19");
        System.out.println();
         // Upper Half
        for (int i = 1; i <= N; i++) {

            // Left Stars
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 1; i <= N; i++) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
}
}
