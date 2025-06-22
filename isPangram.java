import java.util.Scanner;

public class isPangram {
    // pangram is that sentence which contains all the letters of the alphabet at least once.

    // Method to check if a string is a pangram
    public static boolean isPangram(String str) {
        int freq[] = new int[26];
        int countUnique = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int idxOfLetter = ch - 'a';
                if (freq[idxOfLetter] == 0) {
                    freq[idxOfLetter]++;
                    countUnique++;
                }
            }
        }

        return countUnique == 26;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📌 Pangram Checker");
        System.out.println("-------------------");
        System.out.print("👉 Enter a sentence: ");
        String str = scanner.nextLine();

        if (isPangram(str)) {
            System.out.println("The sentence is a Pangram (contains all 26 letters).");
        } else {
            System.out.println("The sentence is NOT a Pangram (missing some letters).");
        }
}
}
