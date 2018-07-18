package Sudoku;
/*
 squares of sudoku:

 A | B | C
 ---------
 D | E | F
 ---------
 G | H | I

*/

public class Variables {
    public static int sudoku[][] = new int[9][9];

    public static boolean sudokuElementExistAsquare[] = new boolean[10];
    public static boolean sudokuElementExistBsquare[] = new boolean[10];
    public static boolean sudokuElementExistCsquare[] = new boolean[10];
    public static boolean sudokuElementExistDsquare[] = new boolean[10];
    public static boolean sudokuElementExistEsquare[] = new boolean[10];
    public static boolean sudokuElementExistFsquare[] = new boolean[10];
    public static boolean sudokuElementExistGsquare[] = new boolean[10];
    public static boolean sudokuElementExistHsquare[] = new boolean[10];
    public static boolean sudokuElementExistIsquare[] = new boolean[10];

    public static boolean sudokuElementExistArow[] = new boolean[10];
    public static boolean sudokuElementExistBrow[] = new boolean[10];
    public static boolean sudokuElementExistCrow[] = new boolean[10];
    public static boolean sudokuElementExistDrow[] = new boolean[10];
    public static boolean sudokuElementExistErow[] = new boolean[10];
    public static boolean sudokuElementExistFrow[] = new boolean[10];
    public static boolean sudokuElementExistGrow[] = new boolean[10];
    public static boolean sudokuElementExistHrow[] = new boolean[10];
    public static boolean sudokuElementExistIrow[] = new boolean[10];

    public static boolean sudokuElementExistAcolumn[] = new boolean[10];
    public static boolean sudokuElementExistBcolumn[] = new boolean[10];
    public static boolean sudokuElementExistCcolumn[] = new boolean[10];
    public static boolean sudokuElementExistDcolumn[] = new boolean[10];
    public static boolean sudokuElementExistEcolumn[] = new boolean[10];
    public static boolean sudokuElementExistFcolumn[] = new boolean[10];
    public static boolean sudokuElementExistGcolumn[] = new boolean[10];
    public static boolean sudokuElementExistHcolumn[] = new boolean[10];
    public static boolean sudokuElementExistIcolumn[] = new boolean[10];

}
