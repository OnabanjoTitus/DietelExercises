import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        int diameter;
        double circumference;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius=input.nextInt();
        System.out.printf(" The diameter is %d%n",2*radius);
        System.out.printf(" The circumference is %f%n ",2*radius*Math.PI);
        System.out.printf("The area is %f%n",Math.PI*radius*radius);

    }
}
