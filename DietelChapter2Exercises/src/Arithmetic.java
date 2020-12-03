import java.util.Scanner;

public class Arithmetic {
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            int x,y;

            System.out.print("Enter the first integer:  ");
            x = input.nextInt();
            System.out.print("Enter the second integer: ");
            y= input.nextInt();

            int sum = x+y;
            int product = x*y;
            int difference = x-y;
            int qoutient = x/y;

            System.out.printf("The sum of the numbers: %d, %d. is %d%n", x,y,sum);
            System.out.printf("The product of the numbers: %d, %d. is %d%n", x,y,product);
            System.out.printf("The difference of the numbers: %d, %d. is %d%n", x,y,difference);
            System.out.printf("The qoutient of the numbers: %d, %d. is %d%n", x,y,qoutient);
        }
}