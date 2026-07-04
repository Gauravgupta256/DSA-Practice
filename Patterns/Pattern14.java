public class Pattern14 {
    public static void main(String[] args) {
        // N = 5
        // A 
        // A B 
        // A B C
        // A B C D 
        // A B C D E
        int N = 5;
        System.out.println("PATTERN-14");
        System.out.println();
        for(int i=1; i<=N; i++) {
            char ch = 'A';
            for(int j=1; j<=i; j++) {
               System.out.print(ch+" ");
               // or sout((char) ('A'+j-1)+" ");
               ch++;
            }
            System.out.println();
        }
    }   
}
