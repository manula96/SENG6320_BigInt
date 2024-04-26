import static org.junit.Assert.*;

import org.SENG6320.BigInteger;
import org.junit.Test;

public class BigIntegerTestRadix {

    @Test
    public void testPositiveBigIntegerInDecimal() {
        String val = "9876543210";
        int radix = 10;
        BigInteger expected = new BigInteger("9876543210");
        assertEquals(expected, new BigInteger(val, radix));
    }

    @Test
    public void testNegativeBigIntegerInDecimal() {
        String val = "-9876543210";
        int radix = 10;
        BigInteger expected = new BigInteger("-9876543210");
        assertEquals(expected, new BigInteger(val, radix));
    }

    @Test
    public void testZeroValue() {
        String val = "0";
        int radix = 10;
        BigInteger expected = BigInteger.ZERO;
        assertEquals(expected, new BigInteger(val, radix));
    }

    @Test(expected = NumberFormatException.class)
    public void testNonnumericValue() {
        String val = "9876abcj";
        int radix = 16;
        new BigInteger(val, radix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeRadixLessThan2() {
        String val = "9876543210";
        int radix = 1;
        new BigInteger(val, radix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeRadixGreaterThan36() {
        String val = "9876543210";
        int radix = 37;
        new BigInteger(val, radix);
    }
}
