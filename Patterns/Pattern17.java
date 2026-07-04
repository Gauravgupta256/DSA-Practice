public class Pattern17 {
    public static void main(String[] args) {
        // N = 5
        //         A
        //       A B A
        //     A B C B A
        //   A B C D C B A 
        // A B C D E D C B A
        int N = 5;
        System.out.println("PATTERN-17");
        System.out.println();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=(N-i); j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print(ch);
                if(j < i ) ch++;
                else ch--;
            }
              System.out.println();
        }
    }
}