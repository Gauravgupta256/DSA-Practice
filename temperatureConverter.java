import java.util.Scanner;

public class temperatureConverter {

    static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static float celsiusToKelvin(float celsius) {
        return celsius + 273.15f;
    }

    static float kelvinToCelsius(float kelvin) {
        return kelvin - 273.15f;
    }

    static float fahrenheitToKelvin(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15f;
    }

    static float kelvinToFahrenheit(float kelvin) {
        return (kelvin - 273.15f) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nChoose a conversion or type 0 to exit:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
                continue;
            }

            int op = sc.nextInt();
            if (op == 0) {
                System.out.println("Exiting program. Thanks for using the temperature converter!");
                break; 
            }

            switch (op) {
                case 1:
                    System.out.println("Fahrenheit to Celsius");
                    System.out.println("Enter temperature in Fahrenheit: ");
                    float fahrenheit = sc.nextFloat();
                    System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;

                case 2:
                    System.out.println("Celsius to Fahrenheit");
                    System.out.println("Enter temperature in Celsius: ");
                    float celsius = sc.nextFloat();
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;

                case 3:
                    System.out.println("Celsius to Kelvin");
                    System.out.println("Enter temperature in Celsius: ");
                    float c = sc.nextFloat();
                    System.out.println("Temperature in Kelvin: " + celsiusToKelvin(c));
                    break;

                case 4:
                    System.out.println("Kelvin to Celsius");
                    System.out.println("Enter temperature in Kelvin: ");
                    float k = sc.nextFloat();
                    System.out.println("Temperature in Celsius: " + kelvinToCelsius(k));
                    break;

                case 5:
                    System.out.println("Fahrenheit to Kelvin");
                    System.out.println("Enter temperature in Fahrenheit: ");
                    float f = sc.nextFloat();
                    System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(f));
                    break;

                case 6:
                    System.out.println("Kelvin to Fahrenheit");
                    System.out.println("Enter temperature in Kelvin: ");
                    float ke = sc.nextFloat();
                    System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(ke));
                    break;

                default:
                    System.out.println("Invalid selection! Please enter a number between 1 and 6.");
            }
        }
        sc.close(); 
    }
}