import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        System.out.println("Enter the base value:");
        int base= input.nextInt();
        System.out.println("Enter the exponent");
        int exponent= input.nextInt();
        int pow=exponent;
        if(exponent==0){
        }
        if (exponent>0){
            while(pow>0){
                number=number*base;
                pow--;
            }
        }
        System.out.printf("The Exponentiation of (%d,%d) is %d",base,exponent,number);
    }
}
