import java.util.Scanner;

public class Multiple {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number1,number2;
        System.out.print("Enter the number:");
        number1 = input.nextInt();
        System.out.print("Enter the number:");
        number2 = input.nextInt();
        if (number1%number2==0)
            System.out.printf("%d is a multiple of %d%n",number2,number1);
        if (number1%number2>0)
            System.out.printf("%d is not a multiple of %d%n",number2,number1);












    }
}
