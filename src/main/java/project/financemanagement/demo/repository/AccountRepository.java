package project.financemanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.financemanagement.demo.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {
}
