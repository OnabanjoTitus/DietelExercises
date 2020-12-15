public class ModifiedCompoundInterestProgram2 {
    public static void main(String[] args) {
       int amount = 0;
       double remainder = 0;
       double principal=1000;
       double rate=0.05;
        System.out.printf("%s%20s%n","Year","Amount on Deposit");
        for(int year=1;year<=10;year++){
            double cash=(principal*Math.pow(1.0+rate,year));
             remainder= (cash%year);
             amount=(int)(cash);
            System.out.printf("The amount is $%d and %16.2f cents%n",amount,remainder);
                  }

    }
}
