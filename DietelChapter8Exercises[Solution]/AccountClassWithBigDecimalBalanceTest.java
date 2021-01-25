public class AccountClassWithBigDecimalBalanceTest {
    public static void main(String[] args) {
        AccountClassWithBigDecimalBalance accountClassWithBigDecimalBalance = new
                AccountClassWithBigDecimalBalance("Titus Onabanjo",200);
        System.out.println(  accountClassWithBigDecimalBalance.getAccountBalance());
        accountClassWithBigDecimalBalance.depositBalance(200);
        System.out.println(  accountClassWithBigDecimalBalance.getAccountBalance());
        System.out.printf("%s%20s%n","AccountName","AccountBalance");
        System.out.printf("%s%10s%n",accountClassWithBigDecimalBalance.getAccountName(),accountClassWithBigDecimalBalance.getAccountBalance());
    }

}
