package project.financemanagement.demo.controller;

import org.springframework.web.bind.annotation.*;
import project.financemanagement.demo.model.entity.Account;

import java.util.List;

@RequestMapping("/account")
public interface AccountController {
    @GetMapping
    List<Account> findEveryAccount();

    @GetMapping("/{id}")
    Account getAccount(@PathVariable String id);

    @PostMapping
    Account addAccount(@RequestBody Account account);

    @PutMapping("/{id}")
    Account updateAccount(@PathVariable String id, @RequestBody Account account);

    @DeleteMapping("/{id}")
    void deleteAccount(@PathVariable String id);
}
