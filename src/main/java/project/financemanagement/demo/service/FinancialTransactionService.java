package project.financemanagement.demo.service;

import project.financemanagement.demo.model.FinancialTransaction;

import java.util.List;

public interface FinancialTransactionService {
    public List<FinancialTransaction> findEveryTransaction();

    public FinancialTransaction getTransaction(String id);

    public FinancialTransaction addTransaction(FinancialTransaction transaction);

    public FinancialTransaction updateTransaction(String id, FinancialTransaction transaction);

    public void deleteTransaction(String id);
}
