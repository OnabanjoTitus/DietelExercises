import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter user input");
        int number=input.nextInt();
        int a1=number/10000;
        int b1=number%10000;
        int a2=b1/1000;
        int b2=b1%1000;
        int a3=b2/100;
        int b3=b2%100;
        int a4=b3/10;
        int b4=b3%10;
        int a5=b4;
        int b5=b4;


        while(number>99999){
            System.out.println("Enter a number of length 5:");
            number=input.nextInt();
            a1=number/10000;
             b1=number%10000;
             a2=b1/1000;
             b2=b1%1000;
             a3=b2/100;
             b3=b2%100;
             a4=b3/10;
             b4=b3%10;
             a5=b4;
             b5=b4;
        }
        if(a1==a5 && a2==a4){
            System.out.printf("The number %d is a palindrome%n",number);
        }else{
            System.out.printf("The number %d is not a palindrome%n",number);}
    }
}

