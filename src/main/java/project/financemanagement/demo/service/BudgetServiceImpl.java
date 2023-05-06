package project.financemanagement.demo.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import project.financemanagement.demo.mapper.BudgetMapper;
import project.financemanagement.demo.model.dto.BudgetRequest;
import project.financemanagement.demo.model.entity.Budget;
import project.financemanagement.demo.repository.BudgetRepository;

import java.util.List;

@Service
@Data
public class BudgetServiceImpl implements BudgetService{

    private BudgetRepository budgetRepository;

    @Override
    public List<Budget> getEveryBudget() {
        return this.budgetRepository.findAll();
    }

    @Override
    public Budget getBudget(Long id) {
        return this.budgetRepository.getReferenceById(id);
    }

    @Override
    public Budget createBudget(BudgetRequest request) {
        return this.budgetRepository.save(BudgetMapper.INSTANCE.toBudget(request));
    }

    @Override
    public Budget updateBudget(Budget budget) {
        return this.budgetRepository.save(BudgetMapper.INSTANCE.update(
                this.budgetRepository.getReferenceById(budget.getBudgetId()),budget));
    }

    @Override
    public void deleteBudget(Long id) {
        this.budgetRepository.deleteById(id);
    }
}
