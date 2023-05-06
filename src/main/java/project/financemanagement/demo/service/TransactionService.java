package project.financemanagement.demo.service;

import project.financemanagement.demo.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getEveryTransaction();

    Transaction getTransaction(Long id);

    Transaction createTransaction(Transaction transaction);

    Transaction updateTransaction(Long id, Transaction transaction);

    void deleteTransaction(Long id);
}
