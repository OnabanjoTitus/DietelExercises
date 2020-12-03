public class RemovingDuplicatedCodeInMethodMain {
    private String name;
    private double balance;

    public RemovingDuplicatedCodeInMethodMain(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        if(balance>=0){
        this.balance += balance;}
    }
public void withdrawal(double cash){
        if(cash<=this.balance){
            this.balance-=cash;
        }
        else{
            System.out.println("You don't have sufficient balance");
            System.out.printf("Your current account balance is %f%n",this.balance);
        }
}
}
