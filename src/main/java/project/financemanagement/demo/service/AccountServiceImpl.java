package project.financemanagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.entity.Account;
import project.financemanagement.demo.repository.AccountRepository;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getEveryAccount() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long id) {
        if(this.accountRepository.findById(id).isPresent()){
            return this.accountRepository.getReferenceById(id);
        }
        throw new RuntimeException();
    }

    @Override
    public Account createAccount(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Long id, Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        this.accountRepository.deleteById(id);
    }
}
