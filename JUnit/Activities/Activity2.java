package activities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity2 {

	@Test
	void notEnoughFunds() {
		BankAccount BA=new BankAccount(10);
		assertThrows(NotEnoughFundsException.class, () -> BA.withdraw(20));
	} 
	
	@Test
	void enoughFunds() {
		BankAccount BA=new BankAccount(100);
		assertDoesNotThrow(() -> BA.withdraw(40));
	}

}
