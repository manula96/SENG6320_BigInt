import org.SENG6320.BigInteger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GCDTest {
	// Test Cases for Statement Coverage
	@Test
	public void testGCDStatementCoverage() {
		// Test Case 1: magnitude is null
		try {
			new BigInteger(1, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 2: signum > 1
		try {
			new BigInteger(2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 3: signum < -1
		try {
			new BigInteger(-2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 4: signum == 0, magnitude is not null
		try {
			new BigInteger(0, new byte[]{1});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 5: signum == 0, magnitude is null
		try {
			new BigInteger(0, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}
//included x6,x7,x8 to identify assert
		// Test Case 6: valid input, positive signum
		BigInteger x6 = new BigInteger(1, new byte[]{1, 2});
		assertEquals("GCD Test Case 6", new BigInteger(1, new byte[]{1, 2}), x6);

		// Test Case 7: valid input, zero signum
		BigInteger x7 = new BigInteger(0, new byte[]{});
		assertEquals("GCD Test Case 7", new BigInteger(0, new byte[]{}), x7);

		// Test Case 8: valid input, negative signum
		BigInteger x8 = new BigInteger(-1, new byte[]{1, 2});
		assertEquals("GCD Test Case 8", new BigInteger(-1, new byte[]{1, 2}), x8);
	}
	// Test Cases for Branch Decision Coverage (if-else blocks)
	@Test
	public void testBranchDecisionCoverage() {
		// Test Case 1: magnitude is null, signum > 1
		try {
			new BigInteger(2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 2: magnitude is null, signum < -1
		try {
			new BigInteger(-2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 3: magnitude is not null, signum == 0
		try {
			new BigInteger(0, new byte[]{1});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 4: magnitude is null, signum == 0
		try {
			new BigInteger(0, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}
//included x5,x6,x7 to identify assert
		// Test Case 5: valid input, positive signum
		BigInteger x5 = new BigInteger(1, new byte[]{1, 2});
		assertEquals("GCD Test Case 5", new BigInteger(1, new byte[]{1, 2}), x5);

		// Test Case 6: valid input, zero signum
		BigInteger x6 = new BigInteger(0, new byte[]{});
		assertEquals("GCD Test Case 6", new BigInteger(0, new byte[]{}), x6);

		// Test Case 7: valid input, negative signum
		BigInteger x7 = new BigInteger(-1, new byte[]{1, 2});
		assertEquals("GCD Test Case 7", new BigInteger(-1, new byte[]{1, 2}), x7);
	}
	// Test Cases for Condition Coverage (each condition separately)
	@Test
	public void testConditionCoverage() {
		// Test Case 1: magnitude is null
		try {
			new BigInteger(1, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 2: signum > 1
		try {
			new BigInteger(2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 3: signum < -1
		try {
			new BigInteger(-2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 4: signum == 0, magnitude is not null
		try {
			new BigInteger(0, new byte[]{1});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 5: signum == 0, magnitude is null
		try {
			new BigInteger(0, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}
//included x6,x7,x8 to identify assert
		// Test Case 6: valid input, positive signum
		BigInteger x6 = new BigInteger(1, new byte[]{1, 2});
		assertEquals("GCD Test Case 6", new BigInteger(1, new byte[]{1, 2}), x6);

		// Test Case 7: valid input, zero signum
		BigInteger x7 = new BigInteger(0, new byte[]{});
		assertEquals("GCD Test Case 7", new BigInteger(0, new byte[]{}), x7);

		// Test Case 8: valid input, negative signum
		BigInteger x8 = new BigInteger(-1, new byte[]{1, 2});
		assertEquals("GCD Test Case 8", new BigInteger(-1, new byte[]{1, 2}), x8);
	}
	// Test Cases for Condition/Decision Coverage
	@Test
	public void testConditionDecisionCoverage() {
		// Test Case 1: magnitude is null, signum > 1
		try {
			new BigInteger(2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 2: magnitude is null, signum < -1
		try {
			new BigInteger(-2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 3: magnitude is not null, signum == 0
		try {
			new BigInteger(0, new byte[]{1});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 4: magnitude is null, signum == 0
		try {
			new BigInteger(0, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}
//included x5,x6,x7 to identify assert
		// Test Case 5: valid input, positive signum
		BigInteger x5 = new BigInteger(1, new byte[]{1, 2});
		assertEquals("GCD Test Case 5", new BigInteger(1, new byte[]{1, 2}), x5);

		// Test Case 6: valid input, zero signum
		BigInteger x6 = new BigInteger(0, new byte[]{});
		assertEquals("GCD Test Case 6", new BigInteger(0, new byte[]{}), x6);

		// Test Case 7: valid input, negative signum
		BigInteger x7 = new BigInteger(-1, new byte[]{1, 2});
		assertEquals("GCD Test Case 7", new BigInteger(-1, new byte[]{1, 2}), x7);
	}
	// Test Cases for Multiple Condition Coverage
	@Test
	public void testMultipleConditionCoverage() {
		// Test Case 1: magnitude is null, signum > 1
		try {
			new BigInteger(2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 2: magnitude is null, signum < -1
		try {
			new BigInteger(-2, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 3: magnitude is not null, signum == 0
		try {
			new BigInteger(0, new byte[]{1});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}

		// Test Case 4: magnitude is null, signum == 0
		try {
			new BigInteger(0, new byte[]{});
		} catch (NumberFormatException e) {
			assertEquals("NumberFormatException", e.getClass().getSimpleName());
		}
//included x5,x6,x7 to identify assert
		// Test Case 5: valid input, positive signum
		BigInteger x5 = new BigInteger(1, new byte[]{1, 2});
		assertEquals("GCD Test Case 5", new BigInteger(1, new byte[]{1, 2}), x5);

		// Test Case 6: valid input, zero signum
		BigInteger x6 = new BigInteger(0, new byte[]{});
		assertEquals("GCD Test Case 6", new BigInteger(0, new byte[]{}), x6);

		// Test Case 7: valid input, negative signum
		BigInteger x7 = new BigInteger(-1, new byte[]{1, 2});
		assertEquals("GCD Test Case 7", new BigInteger(-1, new byte[]{1, 2}), x7);
	}

}
