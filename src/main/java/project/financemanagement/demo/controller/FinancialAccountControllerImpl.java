package project.financemanagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import project.financemanagement.demo.model.FinancialAccount;
import project.financemanagement.demo.service.FinancialAccountService;

import java.util.List;

@RestController
public class FinancialAccountControllerImpl implements FinancialAccountController{
    private final FinancialAccountService financialAccountService; // Constructor injection

    @Autowired
    public FinancialAccountControllerImpl(FinancialAccountService financialAccountService) {
        this.financialAccountService = financialAccountService;
    }

    @Override
    public List<FinancialAccount> findEveryAccount() {
        return null;
    }

    @Override
    public FinancialAccount getAccount(String id) {
        return null;
    }

    @Override
    public FinancialAccount addAccount(FinancialAccount financialAccount) {
        return null;
    }

    @Override
    public FinancialAccount updateAccount(String id, FinancialAccount financialAccount) {
        return null;
    }

    @Override
    public void deleteAccount(String id) {

    }
}
