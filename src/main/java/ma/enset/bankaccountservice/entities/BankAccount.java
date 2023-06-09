package ma.enset.bankaccountservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.bankaccountservice.enums.AccountType;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder

public class BankAccount {
    @Id
    private String id;
    private Date crDate;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)  //pour la stocker dans BD en tant que String
    private AccountType type;
    @ManyToOne
    private Customer customer;
}
