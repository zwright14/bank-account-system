import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	
	CheckingAccount myAccount = new CheckingAccount(1, "myAccount", "myKey");
	CheckingAccount otherAccount = new CheckingAccount(2, "otherAccount", "otherKey");

	@Test
	void testGetterMethods() {
		assertEquals(myAccount.getName(), "myAccount");
		assertEquals(myAccount.getKey(), "myKey");
		assertEquals(myAccount.getNumber(), 1);
		assertEquals(myAccount.getBalance(), 0);
	}
	
	@Test
	void testBalanceChangingMethods() {
		Account myAccount = new CheckingAccount(1, "myAccount", "myKey");
		for (int i=0; i<100; i++) {
			myAccount.depositMoney(i+1);
			assertEquals(myAccount.getBalance(), 2*i+1);
			myAccount.withdrawMoney(i);
			assertEquals(myAccount.getBalance(), i+1);
		}
	}
	
	@Test
	void testSendCheckMethod() {
		myAccount.depositMoney(1000);
		myAccount.sendCheck(500, otherAccount);
		assertEquals(otherAccount.getBalance(), 500);
		assertEquals(myAccount.getBalance(), 500);
	}	
}