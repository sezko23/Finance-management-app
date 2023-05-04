package project.financemanagement.demo.service;

import project.financemanagement.demo.model.FinancialAccount;

import java.util.List;

public interface FinancialAccountService {
    public List<FinancialAccount> findEveryAccount();

    public FinancialAccount getAccount(String id);

    public FinancialAccount addAccount(FinancialAccount account);

    public FinancialAccount updateAccount(String id, FinancialAccount account);

    public void deleteAccount(String id);
}
