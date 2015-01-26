import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class P13 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P13() {
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

        NaturalNumber sum = new NaturalNumber2();
        NaturalNumber number = new NaturalNumber2();

        SimpleReader nums = new SimpleReader1L("data/numbers.txt");
        SimpleWriter out = new SimpleWriter1L("data/file.txt");
        String line = nums.nextLine();

        while (!nums.atEOS()) {
            if (number.canSetFromString(line)) {
//                System.out.println(sum);
                number.setFromString(line);
                out.println(line);
                sum.add(number);
//                System.out.println();
            } else {
                System.err.println("can't create number from: " + line);
            }
            line = nums.nextLine();
        }
        System.out.println();
        System.out.println(sum);

        nums.close();
        out.close();

    }
}
