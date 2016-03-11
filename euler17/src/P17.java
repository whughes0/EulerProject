
/**
 * https://projecteuler.net/problem=17
 *
 * @author William Hughes
 *
 */
public final class P17 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P17() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        /*
         * one 3
         *
         * two 3
         *
         * three 5
         *
         * four 4
         *
         * five 4
         *
         * six 3
         *
         * seven 5
         *
         * eight 5
         *
         * nine 4
         *
         * 36
         *
         *
         * ten 3
         *
         * eleven 6
         *
         * twelve 6
         *
         * thirteen 8
         *
         * fourteen 8
         *
         * fifteen 7
         *
         * sixteen 7
         *
         * seventeen 9
         *
         * eighteen 8
         *
         * nineteen 8
         *
         * 70
         *
         *
         * twenty 6 * 10 + 36
         *
         * thirty 6 * 10 + 36
         *
         * forty 5 * 10 + 36
         *
         * fifty 5 * 10 + 36
         *
         * sixty 5 * 10 + 36
         *
         * seventy 7 * 10 + 36
         *
         * eighty 6 * 10 + 36
         *
         * ninety 6 * 10 + 36
         *
         * 748
         *
         *
         * $ 1-99
         *
         * (36 + 70 + 748) = 854
         *
         *
         * # hundred 7
         *
         * ones[i]+7
         *
         * # hundred and $
         *
         * (ones[i] + 10) * 99 + 854
         *
         * 100-999
         *
         * ones[i]+7 + (ones[i]+10) * 99 + 854
         *
         * ones[i]+7 + ones[i]*99 + 990 + 854
         */

        int ones[] = { 3, 3, 5, 4, 4, 3, 5, 5, 4 };
        int teens[] = { 3, 6, 6, 8, 8, 7, 7, 9, 8, 8 };
        int tens[] = { 6, 6, 5, 5, 5, 7, 6, 6 };

        int sum = 0;

        //1-9
        for (int i = 0; i < ones.length; i++) {
            sum += ones[i];
        }
        System.out.println(sum);

        //10-19
        for (int i = 0; i < teens.length; i++) {
            sum += teens[i];
        }
        System.out.println(sum);

        //20-99
        for (int i = 0; i < tens.length; i++) {
            sum += tens[i] * 10 + 36;
        }
        System.out.println(sum);

        //100-999
        for (int i = 0; i < ones.length; i++) {
            sum += ones[i] + 7 + ones[i] * 99 + 990 + 854;
        }

        //1000
        sum += 11;

        System.out.println(sum);

    }
}
