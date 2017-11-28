package com.src.unittests;
		
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankSystemTest {

		BankSystem myBank = new BankSystem();
				
	@Test
	void testCreateAccount() {
		for (int i=1; i<=100; i++) {
			myBank.createSavingsAccount("savings"+i, "key"+i);
			myBank.createCheckingAccount("checking"+i, "key"+i);
			Account savings = myBank.loginToSavings(2*i-1, "key"+i);
			Account checking = myBank.loginToChecking(2*i, "key"+i);
			assertEquals(savings.getName(), "savings"+i);
			assertEquals(checking.getName(), "checking"+i);
		}
	}
}
