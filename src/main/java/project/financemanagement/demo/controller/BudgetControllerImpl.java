package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import project.financemanagement.demo.model.Budget;

import java.util.List;

@RestController
public class BudgetControllerImpl implements BudgetController{
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
