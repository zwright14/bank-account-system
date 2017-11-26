import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	
	CheckingAccount myCheckingAccount = new CheckingAccount(1, "myCheckingAccount", "myCheckingKey");
	CheckingAccount otherCheckingAccount = new CheckingAccount(2, "otherCheckingAccount", "otherCheckingKey");
	SavingsAccount mySavingsAccount = new SavingsAccount(3, "mySavingsAccount", "mySavingsKey");
	SavingsAccount otherSavingsAccount = new SavingsAccount(4, "otherSavingsAccount", "otherSavingsKey");

	@Test
	void testGetterMethods() {
		assertEquals(myCheckingAccount.getName(), "myCheckingAccount");
		assertEquals(myCheckingAccount.getKey(), "myCheckingKey");
		assertEquals(myCheckingAccount.getNumber(), 1);
		assertEquals(myCheckingAccount.getBalance(), 0);
		assertEquals(mySavingsAccount.getName(), "mySavingsAccount");
		assertEquals(mySavingsAccount.getKey(), "mySavingsKey");
		assertEquals(mySavingsAccount.getNumber(), 3);
		assertEquals(mySavingsAccount.getBalance(), 0);
	}
	
	@Test
	void testBalanceChangingMethods() {
		for (int i=0; i<100; i++) {
			myCheckingAccount.depositMoney(i+1);
			assertEquals(myCheckingAccount.getBalance(), 2*i+1);
			myCheckingAccount.withdrawMoney(i);
			assertEquals(myCheckingAccount.getBalance(), i+1);
		}
		
		for(int i=1; i<=7; i++) {
			mySavingsAccount.depositMoney(i);
			assertEquals(mySavingsAccount.getBalance(), i);
			mySavingsAccount.withdrawMoney(i);
			if (i!=7) {
				assertEquals(mySavingsAccount.getBalance(), 0);
			}
			
			else {
				assertEquals(mySavingsAccount.getBalance(), i);
			}
		}
	}
	
	@Test
	void testSendCheckMethod() {
		myCheckingAccount.depositMoney(1000);
		myCheckingAccount.sendCheck(500, otherCheckingAccount);
		assertEquals(otherCheckingAccount.getBalance(), 500);
		assertEquals(myCheckingAccount.getBalance(), 500);
	}	
}