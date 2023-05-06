package project.financemanagement.demo.model.dto;

import lombok.Data;

@Data
public class AccountRequest {
    private String accountName;
    private String accountType;
    private double accountBalance;
}
