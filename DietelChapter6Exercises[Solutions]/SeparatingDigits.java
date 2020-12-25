import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the firstInteger");
        int a= scanner.nextInt();
        System.out.println("Enter the secondInteger");
        int b= scanner.nextInt();
        quotient(a,b);
        divide(a,b);
        System.out.printf("Enter the number to separate:");
        displayDigits(scanner.nextInt());
    }

    public static void quotient(int number1,int number2) {
    int answer =(number1/number2);
        System.out.printf("%d%n",answer);
    }
    public static void divide(int number1,int number2) {
    int answer = (number1%number2);
        System.out.printf("%d%n",answer);
    }

    public static void displayDigits(int number) {
        if(number>=1 && number<=99999){
            int a1=number/10000;
            int a=number%10000;
            int a2=a/1000;
            int b =a%1000;
            int a3=b/100;
            int c=b%100;
            int a4=c/10;
            int d=c%10;
            System.out.printf("%d  %d  %d  %d  %d", a1,a2,a3,a4,d);
        }else {
            System.out.println("Enter a valid input between 1 and 99999");
        }
    }
}
