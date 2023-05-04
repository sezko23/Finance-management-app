package project.financemanagement.demo.service;

import project.financemanagement.demo.model.Budget;

import java.util.List;

public interface BudgetService{

    public List<Budget> findEveryBudget();

    public Budget getBudget(String id);

    public Budget addBudget(Budget budget);

    public Budget updateBudget(String id, Budget budget);

    public void deleteBudget(String id);
}
