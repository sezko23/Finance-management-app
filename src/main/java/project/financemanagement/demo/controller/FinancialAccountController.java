package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.*;
import project.financemanagement.demo.model.FinancialAccount;

import java.util.List;

@RequestMapping("/account")
public interface FinancialAccountController {
    @GetMapping
    List<FinancialAccount> findEveryAccount();

    @GetMapping("/{id}")
    FinancialAccount getAccount(@PathVariable String id);

    @PostMapping
    FinancialAccount addAccount(@RequestBody FinancialAccount financialAccount);

    @PutMapping("/{id}")
    FinancialAccount updateAccount(@PathVariable String id, @RequestBody FinancialAccount financialAccount);

    @DeleteMapping("/{id}")
    void deleteAccount(@PathVariable String id);
}
