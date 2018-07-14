package Sudoku;

import java.util.Random;

public class Main {
    static int sudoku[][] = new int[9][9];
    static int sudokuSingleLine[] = new int[9];

    // Showing sudoku table in 9x9 area
    static void showSudoku() {
        for (int[] sudokuLine : sudoku) {
            for (int element : sudokuLine) {
                if (element <= 9)
                    System.out.print(element + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    static void testValue(int row, int column, int tmp) {
        System.out.println("row = " + row + ", column = " + column + ", tmp = " + tmp);
        System.out.println();
    }

    // Method is printing single line of sudoku.
    static void showsudokuSingleLine() {
        for (int sudokuSingleElement : sudokuSingleLine) {
            System.out.print(sudokuSingleElement + " ");
        }
    }

    // Method is generating in simple way single line of sudoku.
    static void simpleGenerateSingleLineSudoku() {
        Random random = new Random();
        for (int column = 0; column < 9; column++) {
            sudoku[0][column] = random.nextInt(9) + 1;
            for (int row = 1; row <= 9; row++) {
                if (column == 0) {
                    continue;
                } else {
                    if (column >= row) {
                        if (sudoku[0][column] == sudoku[0][column - row]) {
                            column--;
                        }
                    }
                }
            }
        }
    }

    static void generateSudoku() {
        Random random = new Random();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                sudoku[row][column] = random.nextInt(9) + 1;
                for (int tmp = 1; tmp < 9; tmp++) {
                    testValue(row,column,tmp);
                    showSudoku();
                    if (column == 0 && row == 0) {
                        break;
                    }
                    if (row == 0) {
                        if (sudoku[row][column] == sudoku[row][column - tmp]) {
                            column--;
                            break;
                        }
                        break;
                    }
                    if (column == 0) {
                        if (sudoku[row][column] == sudoku[row - tmp][column]) {
                            column--;
                            break;
                        }
                        break;
                    }
                    if ((sudoku[row][column] == sudoku[row - tmp][column] && row >= tmp) || ((sudoku[row][column] == sudoku[row][column - tmp] && column >= tmp))) {
                        column--;
                        break;
                    }
                }
            }
        }
    }




    // Method is generating single line of sudoku game in step by step.
    static void generateSingleLineSudoku() {
        Random random2 = new Random();
        for (int i = 0; i < 9; i++) {
            sudokuSingleLine[i] = random2.nextInt(9) + 1;
            if (i == 0) {
                continue;
            }
            if (i == 1) {
                if (sudokuSingleLine[i] == sudokuSingleLine[i - 1]) {
                    i--;
                }
            }
            if (i == 2) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2])) {
                    i--;
                }
            }
            if (i == 3) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3])) {
                    i--;
                }
            }
            if (i == 4) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 4])) {
                    i--;
                }
            }
            if (i == 5) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 4]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 5])) {
                    i--;
                }
            }
            if (i == 6) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 4]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 5]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 6])) {
                    i--;
                }
            }
            if (i == 7) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 4]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 5]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 6]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 7])) {
                    i--;
                }
            }
            if (i == 8) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 4]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 5]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 6]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 7]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 8])) {
                    i--;
                }
            }
            if (i == 9) {
                if ((sudokuSingleLine[i] == sudokuSingleLine[i - 1]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 2]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 3]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 4]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 5]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 6]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 7]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 8]) || (sudokuSingleLine[i] == sudokuSingleLine[i - 9])) {
                    i--;
                }
            }
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
        generateSudoku();
        showSudoku();


    }
}



