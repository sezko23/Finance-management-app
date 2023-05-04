package project.financemanagement.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.model.Budget;

import java.util.List;

@AllArgsConstructor
@Service
public class BudgetServiceImpl implements BudgetService{

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
