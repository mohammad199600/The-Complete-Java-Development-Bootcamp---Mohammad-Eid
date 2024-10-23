package service;

import java.math.BigDecimal;
import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    public TradeAccountRepository getRepository() {
        return this.repository;
    }

    public void setRepository(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        // TODO Auto-generated method stub
        MarginAccount account = (MarginAccount) repository.retrieveTradeAccount(id).clone();
        account.setMargin(account.getMargin().add(amount));
        repository.updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        // TODO Auto-generated method stub
        MarginAccount account = (MarginAccount) repository.retrieveTradeAccount(id).clone();
        account.setMargin(account.getMargin().subtract(amount));
        repository.updateTradeAccount(account);
    }

    public void createTradeAccount(MarginAccount source) {
        repository.createTradeAccount(source.clone());
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount source) {
        repository.updateTradeAccount(source);
    }

    public void deleteTradeAccount(String id) {
        repository.deleteTradeAccount(id);
    }

}
