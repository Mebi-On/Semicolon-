import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {

        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = input.nextDouble();

        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9) / 5 + 32;

        System.out.printf("Kelvin: %.2f%n", kelvin);
        System.out.printf("Celsius: %.2f%n", celsius);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        }
    }
}
