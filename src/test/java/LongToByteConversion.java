import java.math.BigInteger;

public class LongToByteConversion {
    static byte[] decimalToBigEndianBinary(String decimal) {
        BigInteger bigInteger = new BigInteger(decimal);
        byte[] magnitude = bigInteger.toByteArray();
        // If the most significant bit is set, add an extra byte with 0x00 as padding
        if ((magnitude[0] & 0x80) != 0) {
            byte[] paddedMagnitude = new byte[magnitude.length + 1];
            System.arraycopy(magnitude, 0, paddedMagnitude, 1, magnitude.length);
            magnitude = paddedMagnitude;
        }

        // Print the byte array
/*        System.out.print("The Magnitude byte array for the expected number: ");
        for (byte b : magnitude) {
            System.out.print(b + " ");
        }*/

        return magnitude;
    }
}
