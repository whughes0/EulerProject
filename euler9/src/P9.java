/**
 * https://projecteuler.net/problem=9
 *
 * @author William Hughes
 *
 */
public final class P9 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P9() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Put your main program code here
         */

        int a, b, c, product;

        for (int i = 1; i <= 998; i++) {
            for (int j = i + 1; j <= 999; j++) {
                for (int k = j + 1; k <= 1000; k++) {
                    if (i + j + k == 1000) {
                        if (i * i + j * j == k * k) {
                            a = i;
                            b = j;
                            c = k;
                            product = i * j * k;
                            System.out
                                    .println("a " + a + " b " + b + " c " + c);
                            System.out.println(product);
                        }
                    }
                }
            }
        }

    }

}
