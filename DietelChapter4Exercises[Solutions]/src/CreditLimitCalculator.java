/*

each customer
1.accountNumber=int
2.Balance at the beginning of the month=int
3.total of all items charged by the customer this month=int
4.total of all credits applied to the customer this month=int
5.allowed credit limit=int
new balance=(beginning balance+charges-credit)
display new balance
for customer whose new balance has exceeded the limit display credit limit exceeded
*/


import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user account Number:");
        int accountNumber= input.nextInt();
        System.out.println("Enter the user account Balance");
        int balance = input.nextInt();
        System.out.println("Total of all items charged by the customer this month:");
        int totalItemsCharged= input.nextInt();
        System.out.println("Total of all credits applied to the customer this month:");
        int totalItemsCredit= input.nextInt();
        System.out.println("Allowed credit limit:");
        int allowedCreditLimit= input.nextInt();
        int newBalance=(balance+totalItemsCharged-totalItemsCredit);
        System.out.printf("The new balance is :%d%n",newBalance);
        if(newBalance<allowedCreditLimit){
            System.out.println("Credit Limit exceeded");
        }


    }
}
