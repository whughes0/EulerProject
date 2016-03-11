import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * https://projecteuler.net/problem=16
 *
 * @author William Hughes
 *
 */
public final class P16 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P16() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        NaturalNumber beeg = new NaturalNumber2(1);
        NaturalNumber two = new NaturalNumber2(2);
        long sum = 0;

        int i = 0;
        while (i < 1000) {
            beeg.multiply(two);
            i++;
        }
        System.out.println();
        while (!beeg.isZero()) {
            sum += beeg.divideBy10();
        }
        System.out.println();

    }
}
