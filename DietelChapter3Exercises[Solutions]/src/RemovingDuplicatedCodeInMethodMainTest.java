import java.util.Scanner;

public class RemovingDuplicatedCodeInMethodMainTest {
    public static void main(String[] args) {
        RemovingDuplicatedCodeInMethodMain account1= new RemovingDuplicatedCodeInMethodMain("onabanjo",2000);
        RemovingDuplicatedCodeInMethodMain account2= new RemovingDuplicatedCodeInMethodMain("titus",1000);
        displayAccount(account1);
        displayAccount(account2);
        account1.deposit(2000);
        displayAccount(account2);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you wish to withdraw here");
        account2.withdrawal(input.nextDouble());
        displayAccount(account2);
        System.out.println("Enter the amount you wish to deposit here");
        account2.deposit(input.nextDouble());
        displayAccount(account2);



    }
    public static void displayAccount( RemovingDuplicatedCodeInMethodMain accountToDisplay)
    {
        System.out.printf("The account name is %s and the account balance is %f%n",accountToDisplay.getName(),accountToDisplay.getBalance());



    }


}
