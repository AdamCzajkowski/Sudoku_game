package Sudoku;
/*
author: Adam Czajkowski
date: July 2018
*/
public class Main {

    public static void main(String[] args) {

        //showSudoku();
        //generateSingleLineSudoku();
        //simpleGenerateSingleLineSudoku();
        //generateSudoku();
        //secondWayToGenerateSudoku();
        Generate.generate3FreeSquaresOfSudoku();
        Generate.generateOtherSquares();
        Show.showDetection();
        Show.showSudoku();
        //showDetection();
        //System.out.println(sudoku[0][0]);
        //sudokuElementExistAsquare[sudoku[0][0]] = true;
        //System.out.println(sudokuElementExistAsquare[sudoku[0][0]]);

    }

}



