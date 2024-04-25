import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class GCDTest {

	@Test
	public void testGCDStatementCoverage() {
	    // Test Case 1: words == null, xval == 0, yval != 0
	    BigInteger x1 = new BigInteger(0, new byte[]{});
	    BigInteger y1 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 1", new BigInteger(10, new byte[]{1, 2}), x1.gcd(y1));

	    // Test Case 2: words != null, xval == 0, yval != 0
	    BigInteger x2 = new BigInteger(0, new byte[]{1, 2});
	    BigInteger y2 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 2", new BigInteger(10, new byte[]{}), x2.gcd(y2));

	    // Test Case 3: words == null, xval != 0, yval != 0
	    BigInteger x3 = new BigInteger(-5, new byte[]{});
	    BigInteger y3 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 3", new BigInteger(5, new byte[]{}), x3.gcd(y3));

	    // Test Case 4: words == null, xval == 0, yval == 0
	    BigInteger x4 = new BigInteger(0, new byte[]{});
	    BigInteger y4 = new BigInteger(0, new byte[]{});
	    assertEquals("GCD Test Case 4", new BigInteger(0, new byte[]{}), x4.gcd(y4));

	    // Test Case 5: words == null, xval == 0, yval < 0
	    BigInteger x5 = new BigInteger(0, new byte[]{});
	    BigInteger y5 = new BigInteger(-1, new byte[]{});
	    assertEquals("GCD Test Case 5", new BigInteger(1, new byte[]{}), x5.gcd(y5));

	    // Test Case 6: Default case
	    BigInteger x6 = new BigInteger(5, new byte[]{1, 2});
	    BigInteger y6 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 6", new BigInteger(1, new byte[]{}), x6.gcd(y6));
	}
	// Test Cases for Branch Decision Coverage (if-else blocks)
	@Test
	public void testGCDBranchDecisionCoverage() {
	    // Test Case 1: words == null
	    BigInteger x1 = new BigInteger(0, new byte[]{});
	    BigInteger y1 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 1", new BigInteger(10, new byte[]{1, 2}), x1.gcd(y1));

	    // Test Case 2: words != null
	    BigInteger x2 = new BigInteger(0, new byte[]{1, 2});
	    BigInteger y2 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 2", new BigInteger(10, new byte[]{}), x2.gcd(y2));

	    // Test Case 3: words == null && xval == 0
	    BigInteger x3 = new BigInteger(0, new byte[]{});
	    BigInteger y3 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 3", new BigInteger(0, new byte[]{}), x3.gcd(y3));

	    // Test Case 4: words == null && xval != 0
	    BigInteger x4 = new BigInteger(-5, new byte[]{});
	    BigInteger y4 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 4", new BigInteger(5, new byte[]{}), x4.gcd(y4));

	    // Test Case 5: words != null && yval == 0
	    BigInteger x5 = new BigInteger(0, new byte[]{1, 2});
	    BigInteger y5 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 5", new BigInteger(10, new byte[]{}), x5.gcd(y5));

	    // Test Case 6: words != null && yval != 0
	    BigInteger x6 = new BigInteger(-5, new byte[]{1, 2});
	    BigInteger y6 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 6", new BigInteger(5, new byte[]{}), x6.gcd(y6));
	}
	// Test Cases for Condition Coverage (each condition separately)
	@Test
	public void testGCDConditionCoverage() {
	    // Test Case 1: words == null
	    BigInteger x1 = new BigInteger(0, new byte[]{});
	    BigInteger y1 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 1", new BigInteger(10, new byte[]{1, 2}), x1.gcd(y1));

	    // Test Case 2: words != null
	    BigInteger x2 = new BigInteger(0, new byte[]{1, 2});
	    BigInteger y2 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 2", new BigInteger(10, new byte[]{}), x2.gcd(y2));

	    // Test Case 3: xval == 0 && yval == 0
	    BigInteger x3 = new BigInteger(0, new byte[]{});
	    BigInteger y3 = new BigInteger(0, new byte[]{});
	    assertEquals("GCD Test Case 3", new BigInteger(0, new byte[]{}), x3.gcd(y3));

	    // Test Case 4: xval == 0 && yval != 0
	    BigInteger x4 = new BigInteger(0, new byte[]{});
	    BigInteger y4 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 4", new BigInteger(10, new byte[]{1, 2}), x4.gcd(y4));

	    // Test Case 5: xval != 0 && yval == 0
	    BigInteger x5 = new BigInteger(-5, new byte[]{});
	    BigInteger y5 = new BigInteger(0, new byte[]{});
	    assertEquals("GCD Test Case 5", new BigInteger(5, new byte[]{}), x5.gcd(y5));

	    // Test Case 6: xval != 0 && yval != 0
	    BigInteger x6 = new BigInteger(-5, new byte[]{1, 2});
	    BigInteger y6 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 6", new BigInteger(5, new byte[]{}), x6.gcd(y6));
	}
	// Test Cases for Condition/Decision Coverage
	@Test
	public void testGCDConditionDecisionCoverage() {
	    // Test Case 1: words == null, xval == 0, yval != 0
	    BigInteger x1 = new BigInteger(0, new byte[]{});
	    BigInteger y1 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 1", new BigInteger(10, new byte[]{1, 2}), x1.gcd(y1));

	    // Test Case 2: words != null, xval == 0, yval != 0
	    BigInteger x2 = new BigInteger(0, new byte[]{1, 2});
	    BigInteger y2 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 2", new BigInteger(10, new byte[]{}), x2.gcd(y2));

	    // Test Case 3: words == null, xval != 0, yval != 0
	    BigInteger x3 = new BigInteger(-5, new byte[]{});
	    BigInteger y3 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 3", new BigInteger(5, new byte[]{}), x3.gcd(y3));

	    // Test Case 4: words == null, xval == 0, yval == 0
	    BigInteger x4 = new BigInteger(0, new byte[]{});
	    BigInteger y4 = new BigInteger(0, new byte[]{});
	    assertEquals("GCD Test Case 4", new BigInteger(0, new byte[]{}), x4.gcd(y4));

	    // Test Case 5: words == null, xval == 0, yval < 0
	    BigInteger x5 = new BigInteger(0, new byte[]{});
	    BigInteger y5 = new BigInteger(-1, new byte[]{});
	    assertEquals("GCD Test Case 5", new BigInteger(1, new byte[]{}), x5.gcd(y5));

	    // Test Case 6: Default case
	    BigInteger x6 = new BigInteger(5, new byte[]{1, 2});
	    BigInteger y6 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 6", new BigInteger(1, new byte[]{}), x6.gcd(y6));
	}
	// Test Cases for Multiple Condition Coverage
	@Test
	public void testGCDMultipleConditionCoverage() {
	    // Test Case 1: words == null, xval == 0, yval != 0
	    BigInteger x1 = new BigInteger(0, new byte[]{});
	    BigInteger y1 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 1", new BigInteger(10, new byte[]{1, 2}), x1.gcd(y1));

	    // Test Case 2: words != null, xval == 0, yval != 0
	    BigInteger x2 = new BigInteger(0, new byte[]{1, 2});
	    BigInteger y2 = new BigInteger(10, new byte[]{});
	    assertEquals("GCD Test Case 2", new BigInteger(10, new byte[]{}), x2.gcd(y2));

	    // Test Case 3: words == null, xval != 0, yval != 0
	    BigInteger x3 = new BigInteger(-5, new byte[]{});
	    BigInteger y3 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 3", new BigInteger(5, new byte[]{}), x3.gcd(y3));

	    // Test Case 4: words == null, xval == 0, yval == 0
	    BigInteger x4 = new BigInteger(0, new byte[]{});
	    BigInteger y4 = new BigInteger(0, new byte[]{});
	    assertEquals("GCD Test Case 4", new BigInteger(0, new byte[]{}), x4.gcd(y4));

	 // Test Case 5: words == null, xval == 0, yval < 0
	    BigInteger x5 = new BigInteger(0, new byte[]{});
	    BigInteger y5 = new BigInteger(-1, new byte[]{});
	    assertEquals("GCD Test Case 5", new BigInteger(1, new byte[]{}), x5.gcd(y5));

	    // Test Case 6: Default case
	    BigInteger x6 = new BigInteger(5, new byte[]{1, 2});
	    BigInteger y6 = new BigInteger(10, new byte[]{1, 2});
	    assertEquals("GCD Test Case 6", new BigInteger(1, new byte[]{}), x6.gcd(y6));
	}

	   

}
