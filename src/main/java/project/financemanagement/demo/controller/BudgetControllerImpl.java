package project.financemanagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import project.financemanagement.demo.model.Budget;
import project.financemanagement.demo.service.BudgetService;

import java.util.List;

@RestController
public class BudgetControllerImpl implements BudgetController{
    private final BudgetService budgetService; // Constructor injection

    @Autowired
    public BudgetControllerImpl(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @Override
    public List<Budget> findEveryBudget() {
        return null;
    }

    @Override
    public Budget getBudget(String id) {
        return null;
    }

    @Override
    public Budget addBudget(Budget budget) {
        return null;
    }

    @Override
    public Budget updateBudget(String id, Budget budget) {
        return null;
    }

    @Override
    public void deleteBudget(String id) {

    }
}
