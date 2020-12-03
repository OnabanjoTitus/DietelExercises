import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        int diameter;
        double circumference;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius=input.nextInt();
        diameter=(2*radius);
        circumference=(2*radius*Math.PI);
        area=(Math.PI*(radius*radius));

        System.out.println("The diameter is "+diameter);
        System.out.println("The circumference is "+circumference);
        System.out.println("The area is "+area);

    }
}
