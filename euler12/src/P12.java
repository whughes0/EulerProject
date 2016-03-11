import components.map.Map;
import components.map.Map2;

/**
 * https://projecteuler.net/problem=12
 *
 * @author William Hughes
 *
 */
public final class P12 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P12() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        //BLECH

        components.map.Map<Long, Integer> factors = new Map2<>();
        int totalfactors = 0;
        long triangle = 0;
        long n = 0;
        long nplus1 = 0;
        long factor = 2;
        long naturalnum = 1; //triangle number index to start from

        //loop through triangle numbers until factor count is at desired value
        while (totalfactors < 500) {
            n = naturalnum;
            nplus1 = naturalnum + 1;
            triangle = n * (n + 1) / 2;

            //find all prime factors of n
            //2 case
            factor = 2;
            while (n % factor == 0) {
                n /= factor;
                if (factors.hasKey(factor)) {
                    //one more factor possible to choose from
                    factors.replaceValue(factor, factors.value(factor) + 1);
                } else {
                    factors.add(factor, 2); //include factor of two 0 or 1 times
                }
            }

            //odd factors
            factor = 3;
            while (n > 1) {
                if (n % factor == 0) {
                    n /= factor;
                    if (factors.hasKey(factor)) {
                        //one more factor possible to choose from
                        factors.replaceValue(factor, factors.value(factor) + 1);
                    } else {
                        factors.add(factor, 2); //include prime factor 0 or 1 times
                    }
                } else {
                    factor += 2;
                }
            }

            //repeat for n+1
            //2 case
            factor = 2;
            while (nplus1 % factor == 0) {
                nplus1 /= factor;
                if (factors.hasKey(factor)) {
                    //one more factor possible to choose from
                    factors.replaceValue(factor, factors.value(factor) + 1);
                } else {
                    factors.add(factor, 2); //include factor of two 0 or 1 times
                }
            }

            //odd factors
            factor = 3;
            while (nplus1 > 1) {
                if (nplus1 % factor == 0) {
                    nplus1 /= factor;
                    if (factors.hasKey(factor)) {
                        //one more factor possible to choose from
                        factors.replaceValue(factor, factors.value(factor) + 1);
                    } else {
                        factors.add(factor, 2); //include prime factor 0 or 1 times
                    }
                } else {
                    factor += 2;
                }
            }

            //remove the /2 in n(n+1)/2 from factors map
            factors.replaceValue(2L, factors.value(2L) - 1);

            //calculate total number of factors found
            totalfactors = 1;
            while (factors.size() > 0) {
                Map.Pair<Long, Integer> pair = factors.removeAny();

                totalfactors *= pair.value();
            }

            naturalnum++;
        }

        System.out.println(totalfactors);
        System.out.println(triangle);

    }
}
