package project.financemanagement.demo.model.dto;

import lombok.Data;
import project.financemanagement.demo.model.entity.Account;

import java.time.LocalDateTime;

@Data
public class TransactionRequest {
    private LocalDateTime transactionDate;
    private double transactionAmount;
    private String transactionDescription;
    private String transactionCategory;
    private String transactionNotes;
    private Account account;
}
