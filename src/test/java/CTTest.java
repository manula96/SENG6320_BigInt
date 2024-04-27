import org.SENG6320.BigInteger;
import org.junit.Test;

import static org.SENG6320.BigInteger.compareTo;
import static org.junit.Assert.assertEquals;

public class CTTest {
    @Test
    public void testCompareToStatementCoverage() {
        // Test Case 1: Both x and y have null words
        BigInteger x1 = new BigInteger(0, new byte[]{});
        BigInteger y1 = new BigInteger(0, new byte[]{});
        assertEquals(0, compareTo(x1, y1));

        // Test Case 2: x is null and y is not null
        BigInteger x2 = new BigInteger(0, new byte[]{});
        BigInteger y2 = new BigInteger(1, new byte[]{1});
        assertEquals(-1, compareTo(x2, y2));

        // Test Case 3: x is not null and y is null
        BigInteger x3 = new BigInteger(1, new byte[]{1});
        BigInteger y3 = new BigInteger(0, new byte[]{});
        assertEquals(1, compareTo(x3, y3));

        // Test Case 4: Both x and y are not null
        BigInteger x4 = new BigInteger(1, new byte[]{2});
        BigInteger y4 = new BigInteger(1, new byte[]{1});
        assertEquals(1, compareTo(x4, y4));
    }
    @Test
    public void testCompareToBranchDecisionCoverage() {
        // Test Case 1: Both x and y have null words
        BigInteger x1 = new BigInteger(0, new byte[]{});
        BigInteger y1 = new BigInteger(0, new byte[]{});
        assertEquals(0, compareTo(x1, y1));

        // Test Case 2: x is null and y is not null
        BigInteger x2 = new BigInteger(0, new byte[]{});
        BigInteger y2 = new BigInteger(1, new byte[]{1});
        assertEquals(-1, compareTo(x2, y2));

        // Test Case 3: x is not null and y is null
        BigInteger x3 = new BigInteger(1, new byte[]{1});
        BigInteger y3 = new BigInteger(0, new byte[]{});
        assertEquals(1, compareTo(x3, y3));

        // Test Case 4: Both x and y are not null
        BigInteger x4 = new BigInteger(1, new byte[]{2});
        BigInteger y4 = new BigInteger(1, new byte[]{1});
        assertEquals(1, compareTo(x4, y4));
    }
    @Test
    public void testCompareToConditionCoverage() {
        // Test Case 1: Both x and y have null words
        BigInteger x1 = new BigInteger(0, new byte[]{});
        BigInteger y1 = new BigInteger(0, new byte[]{});
        assertEquals(0, compareTo(x1, y1));

        // Test Case 2: x is null and y is not null
        BigInteger x2 = new BigInteger(0, new byte[]{});
        BigInteger y2 = new BigInteger(1, new byte[]{1});
        assertEquals(-1, compareTo(x2, y2));

        // Test Case 3: x is not null and y is null
        BigInteger x3 = new BigInteger(1, new byte[]{1});
        BigInteger y3 = new BigInteger(0, new byte[]{});
        assertEquals(1, compareTo(x3, y3));

        // Test Case 4: Both x and y are not null
        BigInteger x4 = new BigInteger(1, new byte[]{2});
        BigInteger y4 = new BigInteger(1, new byte[]{1});
        assertEquals(1, compareTo(x4, y4));
    }
    @Test
    public void testCompareToConditionDecisionCoverage() {
        // Test Case 1: Both x and y have null words
        BigInteger x1 = new BigInteger(0, new byte[]{});
        BigInteger y1 = new BigInteger(0, new byte[]{});
        assertEquals(0, compareTo(x1, y1));

        // Test Case 2: x is null and y is not null
        BigInteger x2 = new BigInteger(0, new byte[]{});
        BigInteger y2 = new BigInteger(1, new byte[]{1});
        assertEquals(-1, compareTo(x2, y2));

        // Test Case 3: x is not null and y is null
        BigInteger x3 = new BigInteger(1, new byte[]{1});
        BigInteger y3 = new BigInteger(0, new byte[]{});
        assertEquals(1, compareTo(x3, y3));

        // Test Case 4: Both x and y are not null
        BigInteger x4 = new BigInteger(1, new byte[]{2});
        BigInteger y4 = new BigInteger(1, new byte[]{1});
        assertEquals(1, compareTo(x4, y4));
    }
    @Test
    public void testCompareToMultipleConditionCoverage() {
        // Test Case 1: Both x and y have null words
        BigInteger x1 = new BigInteger(0, new byte[]{});
        BigInteger y1 = new BigInteger(0, new byte[]{});
        assertEquals(0, compareTo(x1, y1));

        // Test Case 2: x is null and y is not null
        BigInteger x2 = new BigInteger(0, new byte[]{});
        BigInteger y2 = new BigInteger(1, new byte[]{1});
        assertEquals(-1, compareTo(x2, y2));

        // Test Case 3: x is not null and y is null
        BigInteger x3 = new BigInteger(1, new byte[]{1});
        BigInteger y3 = new BigInteger(0, new byte[]{});
        assertEquals(1, compareTo(x3, y3));

        // Test Case 4: Both x and y are not null
        BigInteger x4 = new BigInteger(1, new byte[]{2});
        BigInteger y4 = new BigInteger(1, new byte[]{1});
        assertEquals(1, compareTo(x4, y4));
    }

}
