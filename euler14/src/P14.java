/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class P14 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P14() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        long collatz = 2;
        long n = 0;
        long chain = 0;
        long maxchain = 0, maxcol = 0;

        while (collatz < 1000000) {
            n = collatz;
            chain = 1;
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n *= 3;
                    n++;
                }
                chain++;
            }
            if (chain > maxchain) {
                maxchain = chain;
                maxcol = collatz;
            }
            collatz++;
        }

        System.out.println("collatz: " + maxcol);

    }

}
