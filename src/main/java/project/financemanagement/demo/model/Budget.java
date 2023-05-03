package project.financemanagement.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long budgetId; /*a unique identifier for the budget*/
    private String budgetCategory; /*the category the budget applies to (e.g. rent, groceries, entertainment)*/
    private long budgetAmount; /*the budgeted amount for the category*/
    private LocalDateTime startDate;  /*the start date of the budget period*/
    private LocalDateTime endDate;  /*the end date of the budget period*/
    private long goal; /*a financial goal associated with the budget*/
    private long progress; /*the current progress towards the goal*/
}
