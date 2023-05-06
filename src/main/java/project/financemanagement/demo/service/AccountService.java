package project.financemanagement.demo.service;

import project.financemanagement.demo.model.dto.AccountRequest;
import project.financemanagement.demo.model.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getEveryAccount();

    Account getAccount(Long id);

    Account createAccount(AccountRequest request);

    Account updateAccount(Account account);

    void deleteAccount(Long id);
}
