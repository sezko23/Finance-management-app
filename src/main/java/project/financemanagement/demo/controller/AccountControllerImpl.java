package project.financemanagement.demo.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import project.financemanagement.demo.model.entity.Account;
import project.financemanagement.demo.service.AccountService;

import java.util.List;

@Data
@RestController
public class AccountControllerImpl implements AccountController {
    private final AccountService accountService; // Constructor injection

    @Autowired
    public AccountControllerImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public List<Account> findEveryAccount() {
        return null;
    }

    @Override
    public Account getAccount(String id) {
        return null;
    }

    @Override
    public Account addAccount(Account account) {
        return null;
    }

    @Override
    public Account updateAccount(String id, Account account) {
        return null;
    }

    @Override
    public void deleteAccount(String id) {

    }
}
