import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nEnter a word or number (or type 'exit' to quit): ");
            String input = sc.nextLine().trim(); 

            if (input.equalsIgnoreCase("exit")) { 
                System.out.println("Thanks for using Palidrom Checker!");
                break;
            }

            if (input.isEmpty()) { 
                System.out.println("Invalid input! Please enter a valid word or number.");
                continue;
            }

            String str = input.toLowerCase().replaceAll("[^a-z0-9]", "");
            boolean isPalindrome = new StringBuilder(str).reverse().toString().equals(str); 
            System.out.println("Checking: " + input + " ");
            if (isPalindrome) {
                System.out.println(input + " is a Palindrome!");
            } else {
                System.out.println(input + " is Not a Palindrome.");
            }
        }
        sc.close();
    }
}