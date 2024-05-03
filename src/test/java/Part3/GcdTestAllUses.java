package Part3;

import org.SENG6320.BigInteger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GcdTestAllUses {

    @Test
    public void testT1() {
        BigInteger x = new BigInteger("-8");
        BigInteger y = new BigInteger("-12");
        assertEquals(BigInteger.valueOf(4), x.gcd(y));
    }

    @Test
    public void testT2() {
        BigInteger x = new BigInteger("8");
        BigInteger y = new BigInteger("12");
        assertEquals(BigInteger.valueOf(4), x.gcd(y));
    }

    @Test
    public void testT3() {
        BigInteger x = new BigInteger("-5");
        BigInteger y = new BigInteger("25");
        assertEquals(BigInteger.valueOf(5), x.gcd(y));
    }

    @Test
    public void testT4() {
        BigInteger x = new BigInteger("3");
        BigInteger y = new BigInteger("-9");
        assertEquals(BigInteger.valueOf(3), x.gcd(y));
    }

    @Test
    public void testT5() {
        BigInteger x = new BigInteger("24");
        BigInteger y = new BigInteger("-2147483648");
        assertEquals(BigInteger.valueOf(8), x.gcd(y));
    }

    @Test
    public void testT6() {
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("100");
        assertEquals(BigInteger.valueOf(100), x.gcd(y));
    }

    @Test
    public void testT7() {
        BigInteger x = new BigInteger("-2147483648");
        BigInteger y = new BigInteger("0");
        assertEquals(new BigInteger("2147483648"), x.gcd(y));
    }

    @Test
    public void testT8() {
        BigInteger x = new BigInteger("68719476751");
        BigInteger y = new BigInteger("23");
        assertEquals(BigInteger.valueOf(23), x.gcd(y));
    }

    @Test
    public void testT9() {
        BigInteger x = new BigInteger("-695784701952");
        BigInteger y = new BigInteger("36590037911583");
        assertEquals(BigInteger.valueOf(3), x.gcd(y));
    }

    @Test
    public void testT10() {
        BigInteger x = new BigInteger("1039382085632");
        BigInteger y = new BigInteger("0");
        assertEquals(new BigInteger("1039382085632"), x.gcd(y));
    }

    @Test
    public void testT11() {
        BigInteger x = new BigInteger("11583");
        BigInteger y = new BigInteger("36590037911583");
        assertEquals(BigInteger.valueOf(39), x.gcd(y));
    }
}
