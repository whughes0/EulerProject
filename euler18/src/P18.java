import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;

/**
 * https://projecteuler.net/problem=18
 *
 * @author William Hughes
 *
 */
public final class P18 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private P18() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        final int dim = 15;

        int[][] array = new int[dim][dim];

        int[][] max = new int[dim][dim];

        SimpleReader in = new SimpleReader1L("data/triangle");
        String line = "";

        int row = 0;
        int col = 0;
        int i = 0;
        while (!in.atEOS()) {
            line = in.nextLine();

            i = 0;
            col = 0;
            while (i < line.length()) {
                array[row][col] = Integer.parseInt(line.substring(i, i + 2));
                i += 3;
                col++;
            }
            row++;
        }

        row = dim - 1;
        col = 0;
        while (col < dim) {
            max[row][col] = array[row][col];
            col++;
        }

        row = dim - 2;
        col = 0;

        while (row >= 0) {
            col = 0;
            while (col <= row) {
                if (max[row + 1][col] > max[row + 1][col + 1]) {
                    //choose left
                    max[row][col] = max[row + 1][col] + array[row][col];
                } else {
                    //choose right
                    max[row][col] = max[row + 1][col + 1] + array[row][col];
                }
                col++;
            }
            row--;
        }

        System.out.println(max[0][0]);

        in.close();
    }
}
