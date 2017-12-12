
		
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankSystemTest {

		BankSystem myBank = new BankSystem();
				
	@Test
	void testCreateAccount() {
		for (int i=1; i<=100; i++) {
			myBank.createSavingsAccount("savings"+i, "key"+i);
			myBank.createCheckingAccount("checking"+i, "key"+i);
			Account savings = myBank.findAccount(2*i-1);
			Account checking = myBank.findAccount(2*i);
			assertEquals(savings.getName(), "savings"+i);
			assertEquals(checking.getName(), "checking"+i);
			boolean savingsBool = savings.passwordIsCorrect("key"+i);
			boolean checkingBool = checking.passwordIsCorrect("key"+i);
			assertEquals(savingsBool, true);
			assertEquals(checkingBool, true);

		}
	}
}
