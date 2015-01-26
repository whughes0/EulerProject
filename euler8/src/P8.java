import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class P8 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P8() {
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

        String thing = "7316717653133062491922511967442657474235534919493496983"
                + "520312774506326239578318016984801869478851843858615607891129"
                + "494954595017379583319528532088055111254069874715852386305071"
                + "569329096329522744304355766896648950445244523161731856403098"
                + "711121722383113622298934233803081353362766142828064444866452"
                + "387493035890729629049156044077239071381051585930796086670172"
                + "427121883998797908792274921901699720888093776657273330010533"
                + "678812202354218097512545405947522435258490771167055601360483"
                + "958644670632441572215539753697817977846174064955149290862569"
                + "321978468622482839722413756570560574902614079729686524145351"
                + "004748216637048440319989000889524345065854122758866688116427"
                + "171479924442928230863465674813919123162824586178664583591245"
                + "665294765456828489128831426076900422421902267105562632111110"
                + "937054421750694165896040807198403850962455444362981230987879"
                + "927244284909188845801561660979191338754992005240636899125607"
                + "176060588611646710940507754100225698315520005593572972571636"
                + "269561882670428252483600823257530420752963450";

        NaturalNumber largest = new NaturalNumber2();
        NaturalNumber product = new NaturalNumber2();
        NaturalNumber digit = new NaturalNumber2();
        String num;

        for (int i = 0; i + 12 < 1000; i++) {
            product.setFromInt(1);
            for (int j = 0; j < 13; j++) {
                num = thing.substring(i + j, i + j + 1);
                digit.setFromInt(Integer.parseInt(num));
                product.multiply(digit);
            }
            if (product.compareTo(largest) > 0) {
                largest.transferFrom(product);
            }
        }
        System.out.println(largest);

    }
}
