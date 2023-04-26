package ma.enset.bankaccountservice.repositories;

import ma.enset.bankaccountservice.entities.BankAccount;
import ma.enset.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource //Spring va démarrer Un WS Restfull qui va gérer les BankAccount
public interface BankAccountRepository extends JpaRepository<BankAccount,String> { //string est le type de Id
    @RestResource(path = "/byType")
    List<BankAccount> findByType(AccountType type);
    List<BankAccount> findByCurrency(String currency);
}
