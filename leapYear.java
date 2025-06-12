import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Leap Year Checker");
        System.out.println("Enter a year to check if it's a leap year.");
        System.out.println("Type 'exit' to stop the program.");
        
        while (true) {
            System.out.print("\nEnter a year: ");
            if (sc.hasNextInt()) {
                int year = sc.nextInt();
                if (isLeapYear(year)) {
                    System.out.println(year + " is a leap year ");
                } else {
                    System.out.println(year + " is not a leap year ");
                }
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using the Leap Year Checker! Goodbye ");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid year.");
                }
            }
        }
        
        sc.close();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}