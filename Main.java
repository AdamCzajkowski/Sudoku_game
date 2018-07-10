package Sudoku;

import java.util.Random;

public class Main {
    static int sudoku[][] = new int[9][9];
    static int sudoku1[] = new int[9];

    // Showing sudoku table in 9x9 area
    static void showSudoku() {
        for (int[] sudokuLine : sudoku) {
            for (int element : sudokuLine) {
                if (element <= 9)
                    System.out.print(element + " ");
            }
            System.out.println(" ");
        }
    }

    // Method is printing single line of sudoku.
    static void showSudoku1() {
        for (int sudokuSingleElement : sudoku1) {
            System.out.print(sudokuSingleElement + " ");
        }
    }

    // Method is generating in simple way single line of sudoku.
    static void simpleGenerateSingleLineSudoku() {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            sudoku[0][i] = random.nextInt(9) + 1;
            for (int j = 1; j <= 9; j++) {
                if (i == 0) {
                    continue;
                } else {
                    if (i >= j) {
                        if (sudoku[0][i] == sudoku[0][i - j]) {
                            i--;
                        }
                    }
                }
            }
        }
    }

    static void simpleGenerateSudoku() {
        Random random = new Random();
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                sudoku[j][i] = random.nextInt(9) + 1;
                for (int w = 1; w < 9; w++) {
                    if (i == 0 && j == 0) {
                        continue;
                    } else {
                        if (i >= w && j >= w) {
                            if ((sudoku[j][i] == sudoku[j - w][i - w]) || (sudoku[j][i] == sudoku[j][i - w]) || (sudoku[j][i] == sudoku[j - w][i])) {
                                i--;
                                j--;
                            }
                        }
                    }
                }
            }
        }
    }

    // Method is generating single line of sudoku game in step by step.
    static void generateSingleLineSudoku() {
        Random random2 = new Random();
        for (int i = 0; i < 9; i++) {
            sudoku1[i] = random2.nextInt(9) + 1;
            if (i == 0) {
                continue;
            }
            if (i == 1) {
                if (sudoku1[i] == sudoku1[i - 1]) {
                    i--;
                }
            }
            if (i == 2) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2])) {
                    i--;
                }
            }
            if (i == 3) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3])) {
                    i--;
                }
            }
            if (i == 4) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3]) || (sudoku1[i] == sudoku1[i - 4])) {
                    i--;
                }
            }
            if (i == 5) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3]) || (sudoku1[i] == sudoku1[i - 4]) || (sudoku1[i] == sudoku1[i - 5])) {
                    i--;
                }
            }
            if (i == 6) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3]) || (sudoku1[i] == sudoku1[i - 4]) || (sudoku1[i] == sudoku1[i - 5]) || (sudoku1[i] == sudoku1[i - 6])) {
                    i--;
                }
            }
            if (i == 7) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3]) || (sudoku1[i] == sudoku1[i - 4]) || (sudoku1[i] == sudoku1[i - 5]) || (sudoku1[i] == sudoku1[i - 6]) || (sudoku1[i] == sudoku1[i - 7])) {
                    i--;
                }
            }
            if (i == 8) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3]) || (sudoku1[i] == sudoku1[i - 4]) || (sudoku1[i] == sudoku1[i - 5]) || (sudoku1[i] == sudoku1[i - 6]) || (sudoku1[i] == sudoku1[i - 7]) || (sudoku1[i] == sudoku1[i - 8])) {
                    i--;
                }
            }
            if (i == 9) {
                if ((sudoku1[i] == sudoku1[i - 1]) || (sudoku1[i] == sudoku1[i - 2]) || (sudoku1[i] == sudoku1[i - 3]) || (sudoku1[i] == sudoku1[i - 4]) || (sudoku1[i] == sudoku1[i - 5]) || (sudoku1[i] == sudoku1[i - 6]) || (sudoku1[i] == sudoku1[i - 7]) || (sudoku1[i] == sudoku1[i - 8]) || (sudoku1[i] == sudoku1[i - 9])) {
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
        simpleGenerateSingleLineSudoku();
        showSudoku();


    }
}



