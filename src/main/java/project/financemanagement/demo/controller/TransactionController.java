package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.*;
import project.financemanagement.demo.model.entity.Transaction;

import java.util.List;

@RequestMapping("/transaction")
public interface TransactionController {
    @GetMapping
    List<Transaction> findEveryTransaction();

    @GetMapping("/{id}")
    Transaction getTransaction(@PathVariable String id);

    @PostMapping
    Transaction addTransaction(@RequestBody Transaction transaction);

    @PutMapping("/{id}")
    Transaction updateTransaction(@PathVariable String id, @RequestBody Transaction transaction);

    @DeleteMapping("/{id}")
    void deleteTransaction(@PathVariable String id);
}
