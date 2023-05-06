package project.financemanagement.demo.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.mapper.AccountMapper;
import project.financemanagement.demo.model.dto.AccountRequest;
import project.financemanagement.demo.model.entity.Account;
import project.financemanagement.demo.repository.AccountRepository;

import java.util.List;

@Data
@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;
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
    public Account createAccount(AccountRequest request) {
        return this.accountRepository.save(AccountMapper.INSTANCE.toAccount(request));
    }

    @Override
    public Account updateAccount(Account account) {
        return this.accountRepository.save(AccountMapper.INSTANCE.update(
                this.accountRepository.getReferenceById(account.getAccountId()),account));
    }

    @Override
    public void deleteAccount(Long id) {
        this.accountRepository.deleteById(id);
    }
}
