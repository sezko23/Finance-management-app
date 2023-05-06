package project.financemanagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.entity.Budget;
import project.financemanagement.demo.repository.BudgetRepository;

import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService{

    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetServiceImpl(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public List<Budget> getEveryBudget() {
        return this.budgetRepository.findAll();
    }

    @Override
    public Budget getBudget(Long id) {
        return this.budgetRepository.getReferenceById(id);
    }

    @Override
    public Budget createBudget(Budget budget) {
        return this.budgetRepository.save(budget);
    }

    @Override
    public Budget updateBudget(Long id, Budget budget) {
        return this.budgetRepository.save(budget);
    }

    @Override
    public void deleteBudget(Long id) {
        this.budgetRepository.deleteById(id);
    }
}
