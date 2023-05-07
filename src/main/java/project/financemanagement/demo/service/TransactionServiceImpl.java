package project.financemanagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.entity.Budget;
import project.financemanagement.demo.entity.Transaction;
import project.financemanagement.demo.enumeration.TransactionCategories;
import project.financemanagement.demo.exception.EntityNotFoundException;
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
        return this.transactionRepository.findAllByOrderByTransactionIdAsc();
    }

    @Override
    public Transaction getTransaction(Long id) {
        if (this.transactionRepository.findById(id).isPresent()) {
            return this.transactionRepository.getReferenceById(id);
        }
        throw new EntityNotFoundException("Transaction not found with id: " + id);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return this.transactionRepository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Long id, Transaction updatedTransaction) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Transaction not found with id: " + id));

        transaction.setTransactionDate(updatedTransaction.getTransactionDate());
        transaction.setTransactionAmount(updatedTransaction.getTransactionAmount());
        transaction.setTransactionDescription(updatedTransaction.getTransactionDescription());
        transaction.setTransactionCategory(updatedTransaction.getTransactionCategory());
        transaction.setTransactionNotes(updatedTransaction.getTransactionNotes());

        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Transaction not found with id: " + id));
        this.transactionRepository.deleteById(id);
    }
}
