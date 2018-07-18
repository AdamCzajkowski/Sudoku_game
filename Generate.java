package Sudoku;

import java.util.Random;

public class Generate {

    // Method to generate 3 free squares A, E, I of sudoku.
    static void generate3FreeSquaresOfSudoku() {
        Random random = new Random();
        // square A:
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                Variables.sudoku[row][column] = random.nextInt(9) + 1;
                if (Variables.sudokuElementExistAsquare[Variables.sudoku[row][column]] != true) {
                    Detection.detectionElementOfSudoku(row, column);
                    continue;
                } else {
                    column--;
                }
            }
        }

        // square E:
        for (int row = 3; row < 6; row++) {
            for (int column = 3; column < 6; column++) {
                Variables.sudoku[row][column] = random.nextInt(9) + 1;
                if (Variables.sudokuElementExistEsquare[Variables.sudoku[row][column]] != true) {
                    Detection.detectionElementOfSudoku(row, column);
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
                Variables.sudoku[row][column] = random.nextInt(9) + 1;
                if (Variables.sudokuElementExistIsquare[Variables.sudoku[row][column]] != true) {
                    Detection.detectionElementOfSudoku(row, column);
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
                    Variables.sudoku[row][column] = random.nextInt(9) + 1;
                    System.out.println("row = " + row + ", column = " + column + ", val = " + Variables.sudoku[row][column]);
                    if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistDcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistArow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistEcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistArow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistFcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistArow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistDcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistBrow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistEcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistBrow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistFcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistBrow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistDcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistCrow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistEcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistCrow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else if (((Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] != true) && (Variables.sudokuElementExistFcolumn[Variables.sudoku[row][column]] != true)) && (Variables.sudokuElementExistCrow[Variables.sudoku[row][column]] != true)) {
                        Detection.detectionElementOfSudoku(row, column);
                        System.out.println("Element's saved, try next");
                        break;
                    } else {
                        if ((row >= 3 && row <= 5) && (column >= 3 && column <= 5))
                            System.out.println("Element's saved, try next");
                        column--;
                        break;
                    }
                }
            }
        }

    }
}
