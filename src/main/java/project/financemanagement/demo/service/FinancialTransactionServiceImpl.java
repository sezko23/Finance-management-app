package project.financemanagement.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.model.FinancialTransaction;

import java.util.List;

@AllArgsConstructor
@Service
public class FinancialTransactionServiceImpl implements FinancialTransactionService{
    @Override
    public List<FinancialTransaction> findEveryTransaction() {
        return null;
    }

    @Override
    public FinancialTransaction getTransaction(String id) {
        return null;
    }

    @Override
    public FinancialTransaction addTransaction(FinancialTransaction transaction) {
        return null;
    }

    @Override
    public FinancialTransaction updateTransaction(String id, FinancialTransaction transaction) {
        return null;
    }

    @Override
    public void deleteTransaction(String id) {

    }
}
