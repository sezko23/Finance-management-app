package project.financemanagement.demo.service;

import project.financemanagement.demo.model.dto.TransactionRequest;
import project.financemanagement.demo.model.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getEveryTransaction();

    Transaction getTransaction(Long id);

    Transaction createTransaction(TransactionRequest request);

    Transaction updateTransaction(Transaction transaction);

    void deleteTransaction(Long id);
}
