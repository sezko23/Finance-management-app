package project.financemanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.financemanagement.demo.model.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
