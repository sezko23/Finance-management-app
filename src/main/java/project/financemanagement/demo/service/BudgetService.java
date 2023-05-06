package project.financemanagement.demo.service;

import project.financemanagement.demo.model.dto.BudgetRequest;
import project.financemanagement.demo.model.entity.Budget;

import java.util.List;
import java.util.Optional;

public interface BudgetService{

    List<Budget> getEveryBudget();

    Budget getBudget(Long id);

    Budget createBudget(BudgetRequest request);

    Budget updateBudget(Budget budget);

    void deleteBudget(Long id);
}
