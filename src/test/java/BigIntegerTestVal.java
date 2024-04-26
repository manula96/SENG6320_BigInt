import org.SENG6320.BigInteger;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BigIntegerTestVal {

    @Test
    public void testOneMoreThan9876543210() {
        BigInteger currentBigInteger = new BigInteger("9876543210");
        BigInteger val = new BigInteger("9876543211");
        int expected = -1; // Current BigInteger is less than val
        int result = currentBigInteger.compareTo(val);
        assertEquals(expected, result);
    }

    @Test
    public void testSameNumber() {
        BigInteger currentBigInteger = new BigInteger("9876543210");
        BigInteger val = new BigInteger("9876543210");
        int expected = 0; // Current BigInteger is equal to val
        int result = currentBigInteger.compareTo(val);
        assertEquals(expected, result);
    }

    @Test
    public void testOneLessThan9876543210() {
        BigInteger currentBigInteger = new BigInteger("9876543210");
        BigInteger val = new BigInteger("9876543209");
        int expected = 1; // Current BigInteger is greater than val
        int result = currentBigInteger.compareTo(val);
        assertEquals(expected, result);
    }
}