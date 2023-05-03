package project.financemanagement.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FinancialAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId; /*a unique identifier for the account*/
    private String accountName; /*a name for the account (e.g. savings account, 401k)*/
    private String accountType; /*the type of account (e.g. savings, checking, investment)*/
    private double accountBalance; /*the current balance of the account*/

    @OneToMany(mappedBy = "financialAccount", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<FinancialTransaction> accountTransactions; /*a list of transactions associated with the account*/
}
