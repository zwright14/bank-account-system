
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionTest {

	@Test
	void testGetterMethods() {
		Transaction myTransaction = new Transaction(25, "Gas");
		assertEquals(myTransaction.getValue(), 25.00);
		assertEquals(myTransaction.getDescription(), "Gas");
	}

}
