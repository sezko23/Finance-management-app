package project.financemanagement.demo.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.mapper.TransactionMapper;
import project.financemanagement.demo.model.dto.TransactionRequest;
import project.financemanagement.demo.model.entity.Transaction;
import project.financemanagement.demo.repository.TransactionRepository;

import java.util.List;

@Data
@Service
public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;
    @Override
    public List<Transaction> getEveryTransaction() {
        return this.transactionRepository.findAll();
    }

    @Override
    public Transaction getTransaction(Long id) {
        return this.transactionRepository.getReferenceById(id);
    }

    @Override
    public Transaction createTransaction(TransactionRequest request) {
        return this.transactionRepository.save(TransactionMapper.INSTANCE.toTransaction(request));
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return this.transactionRepository.save(TransactionMapper.INSTANCE.update(
                this.transactionRepository.getReferenceById(transaction.getTransactionId()), transaction));
    }

    @Override
    public void deleteTransaction(Long id) {
        this.transactionRepository.deleteById(id);
    }
}
