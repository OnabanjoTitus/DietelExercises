import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the temp in Fahrenheit");
        celsius(scanner.nextDouble());
        System.out.println("Enter the temp in Celsius");
        Fahrenheit(scanner.nextDouble());

    }

    public static void celsius(double temp) {
        double cel=5.0/9.0*(temp-32);
        System.out.printf("The temperature in Fahrenheit is :%.2f%n",cel);
    }
    public static void Fahrenheit(double temp) {
        double far=9.0/5.0*(temp+32);
        System.out.printf("The temperature in Celsius is :%.2f%n",far);
    }
}
