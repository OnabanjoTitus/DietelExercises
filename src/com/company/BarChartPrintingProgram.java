package com.company;
import java.util.Scanner;
public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int counter=input.nextInt();
        System.out.println("Enter the number2:");
        int counter1=input.nextInt();
        System.out.println("Enter the number3:");
        int counter2=input.nextInt();
        System.out.println("Enter the number4:");
        int counter3=input.nextInt();
        System.out.println("Enter the number5:");
        int counter4=input.nextInt();
        if(counter>=1&&counter<=30&&counter1>=1&&counter1<=30&&counter2>=1&&counter2<=30&&counter3>=1&&counter3<=30&&counter4>=1&&counter4<=30)
        {
                System.out.printf("%2d  ",counter);
                for (int asterisks = 1; asterisks <=counter; asterisks++) {
                System.out.print("*");
            }
                System.out.println();
                System.out.printf("%2d  ",counter1);
                for (int asterisks = 1; asterisks <=counter1; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.printf("%2d  ",counter2);
                for (int asterisks = 1; asterisks <=counter2; asterisks++) { System.out.print("*");}
                System.out.println();
                System.out.printf("%2d  ",counter3);
                for (int asterisks = 1; asterisks <=counter3; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.printf("%2d  ",counter4);
                for (int asterisks = 1; asterisks <=counter4; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();
        }
        else{
            System.out.println("Enter valid inputs between 1 and 30");
        }
    }
}
