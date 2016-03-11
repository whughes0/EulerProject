/**
 * https://projecteuler.net/problem=10
 *
 * @author William Hughes
 *
 */
public final class P10 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P10() {
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

        long sum = 2;
        long number = 3;
        boolean prime;

        while (number < 2000000) {
            prime = true;
            for (int i = 2; prime && i * i <= number; i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                sum += number;
                System.out.println(number);
            }
            number += 2;

        }

        System.out.println();
        System.out.println(sum);

    }

}
