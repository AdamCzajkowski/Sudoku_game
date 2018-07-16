package Sudoku;

import java.util.Random;

/*
author: Adam Czajkowski
date: July 2018
*/
public class Main {
    /*
        squares of sudoku:

        A | B | C
        ---------
        D | E | F
        ---------
        G | H | I

    */
    static int sudoku[][] = new int[9][9];
    static int sudokuA[][] = new int[3][3];
    static int sudokuSingleLine[] = new int[9];
    static boolean sudokuElementExistAsquare[] = new boolean[10];
    static boolean sudokuElementExistBsquare[] = new boolean[10];
    static boolean sudokuElementExistCsquare[] = new boolean[10];
    static boolean sudokuElementExistDsquare[] = new boolean[10];
    static boolean sudokuElementExistEsquare[] = new boolean[10];
    static boolean sudokuElementExistFsquare[] = new boolean[10];
    static boolean sudokuElementExistGsquare[] = new boolean[10];
    static boolean sudokuElementExistHsquare[] = new boolean[10];
    static boolean sudokuElementExistIsquare[] = new boolean[10];

    static boolean sudokuElementExistArow[] = new boolean[10];
    static boolean sudokuElementExistBrow[] = new boolean[10];
    static boolean sudokuElementExistCrow[] = new boolean[10];
    static boolean sudokuElementExistDrow[] = new boolean[10];
    static boolean sudokuElementExistErow[] = new boolean[10];
    static boolean sudokuElementExistFrow[] = new boolean[10];
    static boolean sudokuElementExistGrow[] = new boolean[10];
    static boolean sudokuElementExistHrow[] = new boolean[10];
    static boolean sudokuElementExistIrow[] = new boolean[10];

    static boolean sudokuElementExistAcolumn[] = new boolean[10];
    static boolean sudokuElementExistBcolumn[] = new boolean[10];
    static boolean sudokuElementExistCcolumn[] = new boolean[10];
    static boolean sudokuElementExistDcolumn[] = new boolean[10];
    static boolean sudokuElementExistEcolumn[] = new boolean[10];
    static boolean sudokuElementExistFcolumn[] = new boolean[10];
    static boolean sudokuElementExistGcolumn[] = new boolean[10];
    static boolean sudokuElementExistHcolumn[] = new boolean[10];
    static boolean sudokuElementExistIcolumn[] = new boolean[10];

    // Showing sudoku table in 9x9 area
    static void showSudoku() {
        System.out.println(" ");
        for (int[] sudokuLine : sudoku) {
            for (int element : sudokuLine) {
                if (element <= 9)
                    System.out.print(element + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
    }

    static void testValue(int row, int column, int tmp) {
        System.out.println("row = " + row + ", column = " + column + ", tmp = " + tmp);
        System.out.println();
    }

    static void detectionElementOfSudoku(int row, int column) {
        detectionElementOfSudokuInRows(row, column);
        detectionElementOfSudokuInColumn(row, column);
        detectionElementsOfSudokuInSquares(row, column);
    }

    // Method to generate 3 free squares A, E, I of sudoku.
    static void generate3FreeSquaresOfSudoku() {
        Random random = new Random();
        // square A:
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                sudoku[row][column] = random.nextInt(9) + 1;
                if (sudokuElementExistAsquare[sudoku[row][column]] != true) {
                    detectionElementOfSudoku(row, column);
                    continue;
                } else {
                    column--;
                }
            }
        }

        // square E:
        for (int row = 3; row < 6; row++) {
            for (int column = 3; column < 6; column++) {
                sudoku[row][column] = random.nextInt(9) + 1;
                if (sudokuElementExistEsquare[sudoku[row][column]] != true) {
                    detectionElementOfSudoku(row, column);
                    //sudokuElementExistEsquare[sudoku[row][column]] = true;
                    continue;
                } else {
                    column--;
                }
            }
        }
        // square I:
        for (int row = 6; row < 9; row++) {
            for (int column = 6; column < 9; column++) {
                sudoku[row][column] = random.nextInt(9) + 1;
                if (sudokuElementExistIsquare[sudoku[row][column]] != true) {
                    detectionElementOfSudoku(row, column);
                    continue;
                } else {
                    column--;
                }
            }
        }
    }
    static void generateOtherSquares() {
        Random random = new Random();
        // square B:
        for (int row = 0; row <= 2; row++) {
            for (int column = 3; column <= 5; column++) {
                for (int tmp = 1; tmp <= 99; tmp++) {
                    sudoku[row][column] = random.nextInt(9) + 1;
                    System.out.println("row = " + row + ", column = " + column + ", val = " + sudoku[row][column]);
                    if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistDcolumn[sudoku[row][column]] != true)) && (sudokuElementExistArow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistEcolumn[sudoku[row][column]] != true)) && (sudokuElementExistArow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistFcolumn[sudoku[row][column]] != true)) && (sudokuElementExistArow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistDcolumn[sudoku[row][column]] != true)) && (sudokuElementExistBrow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistEcolumn[sudoku[row][column]] != true)) && (sudokuElementExistBrow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistFcolumn[sudoku[row][column]] != true)) && (sudokuElementExistBrow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistDcolumn[sudoku[row][column]] != true)) && (sudokuElementExistCrow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistEcolumn[sudoku[row][column]] != true)) && (sudokuElementExistCrow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else if (((sudokuElementExistBsquare[sudoku[row][column]] != true) && (sudokuElementExistFcolumn[sudoku[row][column]] != true)) && (sudokuElementExistCrow[sudoku[row][column]] != true)) {
                        detectionElementOfSudoku(row, column);
                        System.out.println("Liczba zapisana, probuje dalej");
                        break;
                    } else {
                        if ((row >= 3 && row <= 5) && (column >= 3 && column <= 5))
                            System.out.println("Liczba zapisana, probuje dalej");
                                column--;
                                break;
                    }
                }
            }
        }

    }

    static void detectionElementOfSudokuInColumn(int row, int column) {

        switch (column) {
            case 0: // Column A
                sudokuElementExistAcolumn[sudoku[row][column]] = true;
                break;
            case 1: // Column B
                sudokuElementExistBcolumn[sudoku[row][column]] = true;
                break;
            case 2: // Column C
                sudokuElementExistCcolumn[sudoku[row][column]] = true;
                break;
            case 3: // Column D
                sudokuElementExistDcolumn[sudoku[row][column]] = true;
                break;
            case 4: // Column E
                sudokuElementExistEcolumn[sudoku[row][column]] = true;
                break;
            case 5: // Column F
                sudokuElementExistFcolumn[sudoku[row][column]] = true;
                break;
            case 6: // Column G
                sudokuElementExistGcolumn[sudoku[row][column]] = true;
                break;
            case 7: // Column H
                sudokuElementExistHcolumn[sudoku[row][column]] = true;
                break;
            case 8: // Column I
                sudokuElementExistIcolumn[sudoku[row][column]] = true;
                break;
        }
    }

    static void detectionElementOfSudokuInRows(int row, int column) {

        switch (row) {
            case 0: // Row A
                sudokuElementExistArow[sudoku[row][column]] = true;
                break;
            case 1: // Row B
                sudokuElementExistBrow[sudoku[row][column]] = true;
                break;
            case 2: // Row C
                sudokuElementExistCrow[sudoku[row][column]] = true;
                break;
            case 3: // Row D
                sudokuElementExistDrow[sudoku[row][column]] = true;
                break;
            case 4: // Row E
                sudokuElementExistErow[sudoku[row][column]] = true;
                break;
            case 5: // Row F
                sudokuElementExistFrow[sudoku[row][column]] = true;
                break;
            case 6: // Row G
                sudokuElementExistGrow[sudoku[row][column]] = true;
                break;
            case 7: // Row H
                sudokuElementExistHrow[sudoku[row][column]] = true;
                break;
            case 8: // Row I
                sudokuElementExistIrow[sudoku[row][column]] = true;
                break;
        }
    }


    static void detectionElementsOfSudokuInSquares(int row, int column) {
        // square A:
        if ((row >= 0 && row <= 2) && (column >= 0 && column <= 2)) {
            sudokuElementExistAsquare[sudoku[row][column]] = true;
        }
        // square B:
        else if ((row >= 0 && row <= 2) && (column >= 3 && column <= 5)) {
            sudokuElementExistBsquare[sudoku[row][column]] = true;
        }
        // square C:
        else if ((row >= 0 && row <= 2) && (column >= 6 && column <= 8)) {
            sudokuElementExistCsquare[sudoku[row][column]] = true;
        }
        // square D:
        else if ((row >= 3 && row <= 5) && (column >= 0 && column <= 2)) {
            sudokuElementExistDsquare[sudoku[row][column]] = true;
        }
        // square E:
        else if ((row >= 3 && row <= 5) && (column >= 3 && column <= 5)) {
            sudokuElementExistEsquare[sudoku[row][column]] = true;
        }
        // square F:
        else if ((row >= 3 && row <= 5) && (column >= 6 && column <= 8)) {
            sudokuElementExistFsquare[sudoku[row][column]] = true;
        }
        // square G:
        else if ((row >= 6 && row <= 8) && (column >= 0 && column <= 2)) {
            sudokuElementExistGsquare[sudoku[row][column]] = true;
        }
        // square H:
        else if ((row >= 6 && row <= 8) && (column >= 3 && column <= 5)) {
            sudokuElementExistHsquare[sudoku[row][column]] = true;
        }
        // square I:
        else if ((row >= 6 && row <= 8) && (column >= 6 && column <= 8)) {
            sudokuElementExistIsquare[sudoku[row][column]] = true;
        }
    }

    // Showing in console present of elements in row, column and square in boolean value .
    static void showDetection() {
        System.out.println("Square E: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistEsquare[i] + ", ");
        }
        System.out.println("\nSquare A:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistAsquare[i] + ", ");
        }

        System.out.println("\nRow E: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistErow[i] + ", ");
        }

        System.out.println("\nRow A: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistArow[i] + ", ");
        }

        System.out.println("\nRow B: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistBrow[i] + ", ");
        }
        System.out.println("\nRow C: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistCrow[i] + ", ");
        }
        System.out.println("\nColumn D: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistDcolumn[i] + ", ");
        }
        System.out.println("\nColumn E: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistEcolumn[i] + ", ");
        }
        System.out.println("\nColumn F: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(sudokuElementExistFcolumn[i] + ", ");
        }
    }


    public static void main(String[] args) {
        /*
        Random random1 = new Random();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = random1.nextInt(9) + 1;
            }
        }
        */
        //showSudoku();
        //generateSingleLineSudoku();
        //simpleGenerateSingleLineSudoku();
        //generateSudoku();
        //secondWayToGenerateSudoku();
        generate3FreeSquaresOfSudoku();
        generateOtherSquares();
        showDetection();
        showSudoku();
        //showDetection();
        //System.out.println(sudoku[0][0]);
        //sudokuElementExistAsquare[sudoku[0][0]] = true;
        //System.out.println(sudokuElementExistAsquare[sudoku[0][0]]);

    }

}



