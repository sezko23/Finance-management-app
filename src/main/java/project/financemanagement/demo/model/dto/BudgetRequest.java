package project.financemanagement.demo.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BudgetRequest {
    private String budgetCategory;
    private double budgetAmount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double goal;
    private double progress;
}
