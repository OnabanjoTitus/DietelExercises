import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double hypotenuse;
        System.out.println("Enter the side 1");
        side1= input.nextDouble();
        System.out.println("Enter the side 2");
        side2= input.nextDouble();

        hypotenuse=Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        System.out.printf("%s%10s%20s%n","side1","side2","hypotenuse");
        System.out.printf("%.2f%10.2f%20.2f",side1,side2,hypotenuse);

    }
}
