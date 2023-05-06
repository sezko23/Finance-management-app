package project.financemanagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.entity.Transaction;
import project.financemanagement.demo.repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getEveryTransaction() {
        return this.transactionRepository.findAll();
    }

    @Override
    public Transaction getTransaction(Long id) {
        return this.transactionRepository.getReferenceById(id);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return this.transactionRepository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Long id, Transaction transaction) {
        return this.transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        this.transactionRepository.deleteById(id);
    }
}
