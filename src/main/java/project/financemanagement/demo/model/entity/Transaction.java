package project.financemanagement.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId; /*a unique identifier for the transaction*/
    private LocalDateTime transactionDate; /*the date the transaction occurred*/
    private double transactionAmount; /*the amount of the transaction*/
    private String transactionDescription; /*a brief description of the transaction*/
    private String transactionCategory;  /*the category the transaction falls under (e.g. rent, groceries, entertainment)*/
    private String transactionNotes; /*any additional notes about the transaction*/

    @ManyToOne
    @JoinColumn(name = "account_id")
    @ToString.Exclude
    private Account account;
}