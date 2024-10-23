package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    public TradeAccountRepository getRepository() {
        return this.repository;
    }

    public void setRepository(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        // TODO Auto-generated method stub
        CashAccount account = (CashAccount) repository.retrieveTradeAccount(id).clone();
        account.setCashBalance(account.getCashBalance().add(amount));
        repository.updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        // TODO Auto-generated method stub
        CashAccount account = (CashAccount) repository.retrieveTradeAccount(id).clone();
        account.setCashBalance(account.getCashBalance().subtract(amount));
        repository.updateTradeAccount(account);
    }
    public void createTradeAccount(CashAccount source){
        repository.createTradeAccount(source.clone());
    }
    public CashAccount retrieveTradeAccount(String id){
        return (CashAccount) repository.retrieveTradeAccount(id);
    }
    public void updateTradeAccount(CashAccount source){
        repository.updateTradeAccount(source);
    }
    public void deleteTradeAccount(String id){
        repository.deleteTradeAccount(id);
    }

}
