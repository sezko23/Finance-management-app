package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.*;
import project.financemanagement.demo.model.FinancialTransaction;

import java.util.List;

@RequestMapping("/transaction")
public interface FinancialTransactionController {
    @GetMapping
    List<FinancialTransaction> findEveryTransaction();

    @GetMapping("/{id}")
    FinancialTransaction getTransaction(@PathVariable String id);

    @PostMapping
    FinancialTransaction addTransaction(@RequestBody FinancialTransaction financialTransaction);

    @PutMapping("/{id}")
    FinancialTransaction updateTransaction(@PathVariable String id, @RequestBody FinancialTransaction financialTransaction);

    @DeleteMapping("/{id}")
    void deleteTransaction(@PathVariable String id);
}
