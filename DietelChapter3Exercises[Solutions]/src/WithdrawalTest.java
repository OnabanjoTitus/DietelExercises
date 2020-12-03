import java.util.Scanner;
public class WithdrawalTest{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Withdrawal account1 = new Withdrawal("Onabanjo Titus", 100.00);
        Withdrawal account2 = new Withdrawal("Onabanjo Damilola", 700.00);

        System.out.printf("The owner of account1 is: %s%n%nAnd the account Balance is:  $%.2f%n",account1.getName(),account1.getBalance ());
        System.out.println();
        System.out.printf("The owner of account2 is: %s%n%nAnd the account Balance is: $%.2f%n",account2.getName(),account2.getBalance() );

        System.out.print("Please enter amount to withdraw from account1:");
        double accounti = input.nextDouble();
        System.out.println();
        account1.setBalance(accounti);
        System.out.printf("The new balance of account1 :  $%.2f%n", account1.getBalance ());

        System.out.print("Please enter amount to withdraw from account2:");
        accounti  = input.nextDouble();

        System.out.println();
        account2.setBalance(accounti);


        System.out.println();
        System.out.printf("The new account balance of account2 is : $%.2f%n", account2.getBalance() );



    }

}