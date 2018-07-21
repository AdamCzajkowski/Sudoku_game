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
        //Show.showSudoku();
        Generate.generateOtherSquares();
        Show.showDetection('E');
        Show.showSudoku();
        //showDetection();
        //System.out.println(sudoku[0][0]);
        //sudokuElementExistAsquare[sudoku[0][0]] = true;
        //System.out.println(sudokuElementExistAsquare[sudoku[0][0]]);

    }

}



