package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import project.financemanagement.demo.model.FinancialTransaction;

import java.util.List;

@RestController
public class FinancialTransactionControllerImpl implements FinancialTransactionController{
    @Override
    public List<FinancialTransaction> findEveryTransaction() {
        return null;
    }

    @Override
    public FinancialTransaction getTransaction(String id) {
        return null;
    }

    @Override
    public FinancialTransaction addTransaction(FinancialTransaction financialTransaction) {
        return null;
    }

    @Override
    public FinancialTransaction updateTransaction(String id, FinancialTransaction financialTransaction) {
        return null;
    }

    @Override
    public void deleteTransaction(String id) {

    }
}
