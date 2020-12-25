import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int gcd=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=scanner.nextInt();
        System.out.println("Enter the second number");
        int second=scanner.nextInt();
        for(int counter=1;counter<=first&&counter<=second;counter++){
            if(first%counter==0 && second%counter==0){
                gcd=counter;
            }
        }
        System.out.printf("The greatest common divisor is %d",gcd);

    }

}
