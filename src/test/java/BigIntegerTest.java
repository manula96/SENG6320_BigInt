import org.junit.Test;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class BigIntegerTest {

    @Test
    public void testPositiveMagnitude() {
        int signum = 1;
        byte[] magnitude = {2,76,-80,22,-22};
        BigInteger expected = new BigInteger("9876543210");
        assertEquals(expected, new BigInteger(signum, magnitude));

    }

    @Test
    public void testNegativeMagnitude() {
        int signum = -1;
        byte[] magnitude = {2,76,-80,22,-22};
        BigInteger expected = new BigInteger("-9876543210");
        assertEquals(expected, new BigInteger(signum, magnitude));
    }

    @Test
    public void testZeroMagnitude() {
        int signum = 0;
        byte[] magnitude = {};
        BigInteger expected = BigInteger.ZERO;
        assertEquals(expected, new BigInteger(signum, magnitude));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSignum() {
        int signum = 2;
        byte[] magnitude = {2,76,-80,22,-22};
        new BigInteger(signum, magnitude);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonZeroMagnitudeWithZeroSignum() {
        int signum = 0;
        byte[] magnitude = {2,76,-80,22,-22};
        new BigInteger(signum, magnitude);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArrayForMagnitude() {
        int signum = 1;
        byte[] magnitude = {};
        new BigInteger(signum, magnitude);
    }
}