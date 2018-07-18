package Sudoku;

public class Detection {
    static void detectionElementOfSudoku(int row, int column) {
        detectionElementOfSudokuInRows(row, column);
        detectionElementOfSudokuInColumn(row, column);
        detectionElementsOfSudokuInSquares(row, column);
    }
    static void detectionElementOfSudokuInColumn(int row, int column) {

        switch (column) {
            case 0: // Column A
                Variables.sudokuElementExistAcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 1: // Column B
                Variables.sudokuElementExistBcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 2: // Column C
                Variables.sudokuElementExistCcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 3: // Column D
                Variables.sudokuElementExistDcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 4: // Column E
                Variables.sudokuElementExistEcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 5: // Column F
                Variables.sudokuElementExistFcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 6: // Column G
                Variables.sudokuElementExistGcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 7: // Column H
                Variables.sudokuElementExistHcolumn[Variables.sudoku[row][column]] = true;
                break;
            case 8: // Column I
                Variables.sudokuElementExistIcolumn[Variables.sudoku[row][column]] = true;
                break;
        }
    }

    static void detectionElementOfSudokuInRows(int row, int column) {

        switch (row) {
            case 0: // Row A
                Variables.sudokuElementExistArow[Variables.sudoku[row][column]] = true;
                break;
            case 1: // Row B
                Variables.sudokuElementExistBrow[Variables.sudoku[row][column]] = true;
                break;
            case 2: // Row C
                Variables.sudokuElementExistCrow[Variables.sudoku[row][column]] = true;
                break;
            case 3: // Row D
                Variables.sudokuElementExistDrow[Variables.sudoku[row][column]] = true;
                break;
            case 4: // Row E
                Variables.sudokuElementExistErow[Variables.sudoku[row][column]] = true;
                break;
            case 5: // Row F
                Variables.sudokuElementExistFrow[Variables.sudoku[row][column]] = true;
                break;
            case 6: // Row G
                Variables.sudokuElementExistGrow[Variables.sudoku[row][column]] = true;
                break;
            case 7: // Row H
                Variables.sudokuElementExistHrow[Variables.sudoku[row][column]] = true;
                break;
            case 8: // Row I
                Variables.sudokuElementExistIrow[Variables.sudoku[row][column]] = true;
                break;
        }
    }


    static void detectionElementsOfSudokuInSquares(int row, int column) {
        // square A:
        if ((row >= 0 && row <= 2) && (column >= 0 && column <= 2)) {
            Variables.sudokuElementExistAsquare[Variables.sudoku[row][column]] = true;
        }
        // square B:
        else if ((row >= 0 && row <= 2) && (column >= 3 && column <= 5)) {
            Variables.sudokuElementExistBsquare[Variables.sudoku[row][column]] = true;
        }
        // square C:
        else if ((row >= 0 && row <= 2) && (column >= 6 && column <= 8)) {
            Variables.sudokuElementExistCsquare[Variables.sudoku[row][column]] = true;
        }
        // square D:
        else if ((row >= 3 && row <= 5) && (column >= 0 && column <= 2)) {
            Variables.sudokuElementExistDsquare[Variables.sudoku[row][column]] = true;
        }
        // square E:
        else if ((row >= 3 && row <= 5) && (column >= 3 && column <= 5)) {
            Variables.sudokuElementExistEsquare[Variables.sudoku[row][column]] = true;
        }
        // square F:
        else if ((row >= 3 && row <= 5) && (column >= 6 && column <= 8)) {
            Variables.sudokuElementExistFsquare[Variables.sudoku[row][column]] = true;
        }
        // square G:
        else if ((row >= 6 && row <= 8) && (column >= 0 && column <= 2)) {
            Variables.sudokuElementExistGsquare[Variables.sudoku[row][column]] = true;
        }
        // square H:
        else if ((row >= 6 && row <= 8) && (column >= 3 && column <= 5)) {
            Variables.sudokuElementExistHsquare[Variables.sudoku[row][column]] = true;
        }
        // square I:
        else if ((row >= 6 && row <= 8) && (column >= 6 && column <= 8)) {
            Variables.sudokuElementExistIsquare[Variables.sudoku[row][column]] = true;
        }
    }



}
