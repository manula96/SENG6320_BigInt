package Part3;

import org.SENG6320.BigInteger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GcdTestAllDefs {

    @Test
    public void testT1() {
        BigInteger x = new BigInteger("-8");
        BigInteger y = new BigInteger("-12");
        assertEquals(BigInteger.valueOf(4), x.gcd(y));
    }

    @Test
    public void testT2() {
        BigInteger x = new BigInteger("24");
        BigInteger y = new BigInteger("2147483648");
        assertEquals(BigInteger.valueOf(8), x.gcd(y));
    }

}

