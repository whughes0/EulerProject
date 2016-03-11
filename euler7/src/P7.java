import components.sequence.Sequence;
import components.sequence.Sequence3;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.  
 * What is the 10 001st prime number?
 * 
 * @author William Hughes
 *
 */
public final class P7 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P7() {
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

        Sequence<Integer> primes = new Sequence3<Integer>();
        primes.add(0, 2);

        int count = 2;
        int number = 3;
        boolean prime;

        while (primes.length() < 10001) {
            prime = true;
            for (int i = 2; prime && i * i <= number; i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                primes.add(primes.length(), number);
                count++;
                System.out.println(number);
            }
            number += 2;

        }

        System.out.println(count + " " + primes.entry(10000));

    }
}
