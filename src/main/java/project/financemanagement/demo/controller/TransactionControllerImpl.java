package project.financemanagement.demo.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.RestController;
import project.financemanagement.demo.model.entity.Transaction;
import project.financemanagement.demo.service.TransactionService;

import java.util.List;

@Data
@RestController
public class TransactionControllerImpl implements TransactionController {

    private final TransactionService transactionService; // Constructor injection

    @Override
    public List<Transaction> findEveryTransaction() {
        return null;
    }

    @Override
    public Transaction getTransaction(String id) {
        return null;
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Transaction updateTransaction(String id, Transaction transaction) {
        return null;
    }

    @Override
    public void deleteTransaction(String id) {

    }
}
