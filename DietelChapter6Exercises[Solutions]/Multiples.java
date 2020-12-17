import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();
        isMultiple(firstNumber,secondNumber);
    }

    public static void isMultiple(int number1, int number2) {
        if (number1 % number2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    }
