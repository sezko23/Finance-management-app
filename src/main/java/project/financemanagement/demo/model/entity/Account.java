package project.financemanagement.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId; /*a unique identifier for the account*/
    private String accountName; /*a name for the account (e.g. savings account, 401k)*/
    private String accountType; /*the type of account (e.g. savings, checking, investment)*/
    private double accountBalance; /*the current balance of the account*/

    @OneToMany(mappedBy = "financialAccount", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Transaction> accountTransactions; /*a list of transactions associated with the account*/
}
