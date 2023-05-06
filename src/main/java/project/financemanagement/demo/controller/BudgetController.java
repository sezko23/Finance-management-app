package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.*;
import project.financemanagement.demo.model.entity.Budget;

import java.util.List;

@RequestMapping("/budget")
public interface BudgetController {
    @GetMapping
    List<Budget> findEveryBudget();

    @GetMapping("/{id}")
    Budget getBudget(@PathVariable String id);

    @PostMapping
    Budget addBudget(@RequestBody Budget budget);

    @PutMapping("/{id}")
    Budget updateBudget(@PathVariable String id, @RequestBody Budget budget);

    @DeleteMapping("/{id}")
    void deleteBudget(@PathVariable String id);
}
