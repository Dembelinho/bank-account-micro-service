package ma.enset.bankaccountservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private double balance;
    private String device;
    private AccountType type;

}
