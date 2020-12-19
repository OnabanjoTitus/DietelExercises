import java.util.Scanner;

public class Minimum3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number");
        float one=input.nextFloat();
        System.out.println("Enter the second number");
        float two=input.nextFloat();
        System.out.println("Enter the third number");
        float three=input.nextFloat();
        System.out.printf("The minimum value is: %f%n",minimum3(one,two,three));

    }

    public static float minimum3(float a,float b,float c) {
        float min=Math.min(a,(Math.min( b, c)));
        return min;

    }
}
