
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalValue=0.0;
        int itemNumber=1;
        double grossPay=0.0;
        double itemValue=0.0;
        System.out.printf("Enter the value of item%d and enter 0 to quit:%n ",itemNumber);
        itemValue=input.nextDouble();
        while(itemValue!=0){
            totalValue+=itemValue;
            System.out.printf("Enter the value of the item%d and enter 0 to quit:%n",itemNumber+1);
            itemValue= input.nextDouble();
            itemNumber++;
        }
        grossPay=(200+(totalValue*9)/100);
        System.out.printf("The gross pay is %.2f",grossPay);
    }

}

