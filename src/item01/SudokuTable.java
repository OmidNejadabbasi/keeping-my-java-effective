package item01;


import static java.lang.Math.sqrt;

/**
 * Represents a sudoku table
 */
public class SudokuTable {

    private int[][] table;
    private int range;

    /**
     * Creates a sudoku table of size <code>size * size</code>. So if you want a 9*9 table you should pass 3.
     *
     * @param size
     */
    public SudokuTable(int size) {
        table = new int[size * size][size * size];
        range = size * size;
    }


    public void setIndexValue(int i, int j, int n) {
        if (!(n <= range && n > 0)) {
            throw new IllegalArgumentException("The number n must be in the right range (1, %d)".formatted(range));
        }
    }


    /**
     * Returns an instance of {@link SudokuTable} by getting values from the string of form :
     *
     * 000000000\n
     * 000000000\n
     * 000000000\n
     *    ....
     *    ....
     *
     * you can use letters a, b, ... for numbers more than 9.
     *
     * @param tableString
     * @return
     */
    public static SudokuTable ofString(String tableString) {
        double sqrt = sqrt(tableString.length());
        int size = (int) sqrt(sqrt);

        if ((int) Math.pow(size, 4) != tableString.length())
            throw new IllegalArgumentException("Cannot create table from input table because its length is not correct!");

        int range = (int) sqrt;


        tableString = tableString.replaceAll("\n", "");
        SudokuTable sudokuTable = new SudokuTable(size);
        for (int i = 0; i < tableString.length(); i++) {

            int num = tableString.charAt(i) - '0';
            if (num > 0 && num <= range) {
                sudokuTable.setIndexValue(i / range, i % range, num);
            }

        }

        return sudokuTable;

    }


}
