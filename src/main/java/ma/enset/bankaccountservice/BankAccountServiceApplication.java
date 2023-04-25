package ma.enset.bankaccountservice;

import ma.enset.bankaccountservice.entities.BankAccount;
import ma.enset.bankaccountservice.enums.AccountType;
import ma.enset.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class BankAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository){
		return args -> {
			for(int i=0; i<10 ;i++){
				BankAccount bankAccount=BankAccount.builder()
						.id(UUID.randomUUID().toString())
						.crDate(new Date())
						.balance(new Random().nextDouble()*952145)
						.currency("MAD")
						.type(Math.random()>0.5? AccountType.SAVING_ACCOUNT:AccountType.CURRENT_ACCOUNT)
						.build();
				bankAccountRepository.save(bankAccount);
			}
		};
	}
}
