package project.financemanagement.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.model.FinancialAccount;

import java.util.List;

@AllArgsConstructor
@Service
public class FinancialAccountServiceImpl implements FinancialAccountService{
    @Override
    public List<FinancialAccount> findEveryAccount() {
        return null;
    }

    @Override
    public FinancialAccount getAccount(String id) {
        return null;
    }

    @Override
    public FinancialAccount addAccount(FinancialAccount account) {
        return null;
    }

    @Override
    public FinancialAccount updateAccount(String id, FinancialAccount account) {
        return null;
    }

    @Override
    public void deleteAccount(String id) {

    }
}
