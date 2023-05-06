package project.financemanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.financemanagement.demo.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
