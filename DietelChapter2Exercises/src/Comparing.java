
/*A java program to collect three numbers, compare and output the :
lowest and the highest of the three*/


import java.util.Scanner;

public class Comparing {
    public static void main (String [] args){
        Scanner collector = new Scanner(System.in);
        System.out.print("Enter first number:");
        int number1 = collector.nextInt();
        System.out.print("Enter Second number:");
        int number2 = collector.nextInt();
        System.out.print("Enter third number:");
        int number3 = collector.nextInt();

        if (number1==number2 && number2==number3)
            System.out.printf("the numbers %d,%d,%d are all the same", number1,number2,number3);
        if (number1==number2 && number2>number3)
            System.out.printf("the highest is  %d and the lowest is %d%n",number2,number3);
        if (number1==number2 && number2<number3)
            System.out.printf("the highest is  %d and the lowest is %d%n",number3,number2);
        if (number2==number3 && number3>number1)
            System.out.printf("the highest is  %d and the lowest is %d%n",number3,number1);
        if (number2==number3 && number3<number1)
            System.out.printf("the highest is  %d and the lowest is %d%n",number1,number3);
        if (number1==number3 && number3>number2)
            System.out.printf("the highest is  %d and the lowest is %d%n",number3,number2);
        if (number1<number2 && number2<number3)
            System.out.printf("the highest is  %d and the lowest is %d%n",number3,number1);
        if (number1<number3 && number3<number2)
            System.out.printf("the highest is  %d and the lowest is %d%n",number2,number1);
        if (number2<number1 && number1<number3)
            System.out.printf("the highest is  %d and the lowest is %d%n",number3,number2);
        if (number2<number3 && number3<number1)
            System.out.printf("the highest is  %d and the lowest is %d%n",number1,number2);
        if (number3<number1 && number1<number2)
            System.out.printf("the highest is  %d and the lowest is %d%n",number2,number3);
        if (number3<number2 && number2<number1)
            System.out.printf("the highest is  %d and the lowest is %d%n",number1,number3);

    }

}