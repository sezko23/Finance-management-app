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
    private Long budgetId; /*a unique identifier for the budget*/
    private String budgetCategory; /*the category the budget applies to (e.g. rent, groceries, entertainment)*/
    private double budgetAmount; /*the budgeted amount for the category*/
    private LocalDateTime startDate;  /*the start date of the budget period*/
    private LocalDateTime endDate;  /*the end date of the budget period*/
    private double goal; /*a financial goal associated with the budget*/
    private double progress; /*the current progress towards the goal*/
}
