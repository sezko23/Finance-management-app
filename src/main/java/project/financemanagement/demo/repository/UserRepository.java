package project.financemanagement.demo.repository;

import org.springframework.data.repository.CrudRepository;
import project.financemanagement.demo.model.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
