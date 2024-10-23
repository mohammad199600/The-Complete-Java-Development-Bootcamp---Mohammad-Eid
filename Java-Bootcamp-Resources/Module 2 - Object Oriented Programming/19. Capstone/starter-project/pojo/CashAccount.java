package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {
 private BigDecimal cashBalance;

    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    public CashAccount(String id,BigDecimal cashBalance) {
        super(id);
        this.cashBalance = cashBalance;
    }

    @Override
    public TradeAccount clone() {
        // TODO Auto-generated method stub
        return new CashAccount(getId(),cashBalance);
    }

}
