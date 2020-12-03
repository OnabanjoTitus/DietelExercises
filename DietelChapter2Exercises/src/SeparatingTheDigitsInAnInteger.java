import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers");
        int number =input.nextInt();
        int a1=number/10000;
        int a=number%10000;
        int a2=a/1000;
        int b =a%1000;
        int a3=b/100;
        int c=b%100;
        int a4=c/10;
        int d=c%10;
        int a5= d;
        int e =d%1;

        System.out.printf("%d %d %d %d %d", a1,a2,a3,a4,a5);





    }
}
