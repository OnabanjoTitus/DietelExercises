import java.math.BigDecimal;
import java.text.NumberFormat;

public class AccountClassWithBigDecimalBalance {
    private String accountName;
    private double accountBalance;
    public AccountClassWithBigDecimalBalance(String accountName, double accountBalance) {
        this.accountName = accountName;
        if(accountBalance>0.0) {
            this.accountBalance = accountBalance;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountBalance() {
        return NumberFormat.getCurrencyInstance().format(getAccountBalanceBigDecimal());
    }

    public void depositBalance(double  accountBalance) {
        if(accountBalance>0.0) {
            this.accountBalance += accountBalance;
        }
    }
    private BigDecimal getAccountBalanceBigDecimal(){
        return BigDecimal.valueOf(accountBalance);
    }
}
