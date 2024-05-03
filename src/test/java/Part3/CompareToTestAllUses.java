package Part3;

import org.SENG6320.BigInteger;
import org.junit.Test;

import static org.SENG6320.BigInteger.compareTo;
import static org.junit.Assert.assertEquals;

public class CompareToTestAllUses {

    @Test
    public void testT1() {
        BigInteger x = new BigInteger("55");
        BigInteger y = new BigInteger("56");
        int expected = -1;
        int result = compareTo(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testT2() {
        BigInteger x = new BigInteger("-3451483648");
        BigInteger y = new BigInteger("3451483647");
        int expected = -1;
        int result = compareTo(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testT3() {
        BigInteger x = new BigInteger("7777");
        BigInteger y = new BigInteger("3451483647");
        int expected = -1;
        int result = compareTo(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testT4() {
        BigInteger x = new BigInteger("3451483647");
        BigInteger y = new BigInteger("3451483647");
        int expected = 0;
        int result = compareTo(x, y);
        assertEquals(expected, result);
    }
}
