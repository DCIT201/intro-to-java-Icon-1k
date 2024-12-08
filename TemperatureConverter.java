import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        //  scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Options available to the user 
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print(" Pick your  option (1 or 2): ");

        // 
        int choice = scanner.nextInt();

        
        double temperature;

        if (choice == 1) {
            // Converting Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", temperature, fahrenheit);
        } else if (choice == 2) {
            // Converting Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            double celsius = (temperature - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", temperature, celsius);
        } else {
            //  When user's choice  is invalid
            System.out.println("Input  a valid number and  run the program again.");
        }

        // Close the scanner
        scanner.close();
    }
}
