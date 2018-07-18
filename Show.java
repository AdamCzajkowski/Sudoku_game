package Sudoku;

public class Show {

    // Showing in console present of elements in row, column and square in boolean value .
    static void showDetection() {
        // Squares
        System.out.println("\n\nSquares: ");
        System.out.println("\nSquare A:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistAsquare[i] + ", ");
        }
        System.out.println("\nSquare B:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistBsquare[i] + ", ");
        }
        System.out.println("\nSquare C:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistCsquare[i] + ", ");
        }
        System.out.println("\nSquare D:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistDsquare[i] + ", ");
        }
        System.out.println("\nSquare E:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistEsquare[i] + ", ");
        }
        System.out.println("\nSquare F:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistFsquare[i] + ", ");
        }
        System.out.println("\nSquare G:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistGsquare[i] + ", ");
        }
        System.out.println("\nSquare H:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistHsquare[i] + ", ");
        }
        System.out.println("\nSquare I:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistIsquare[i] + ", ");
        }


        // Rows
        System.out.println("\n\nRows ");
        System.out.println("\nRow A: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistArow[i] + ", ");
        }
        System.out.println("\nRow B: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistBrow[i] + ", ");
        }
        System.out.println("\nRow C: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistCrow[i] + ", ");
        }
        System.out.println("\nRow D: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistDrow[i] + ", ");
        }
        System.out.println("\nRow E: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistErow[i] + ", ");
        }
        System.out.println("\nRow F: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistFrow[i] + ", ");
        }
        System.out.println("\nRow G: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistGrow[i] + ", ");
        }
        System.out.println("\nRow H: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistHrow[i] + ", ");
        }
        System.out.println("\nRow I: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistIrow[i] + ", ");
        }


        // Column
        System.out.println("\n\nColumn");
        System.out.println("\nColumn A: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistAcolumn[i] + ", ");
        }
        System.out.println("\nColumn B: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistBcolumn[i] + ", ");
        }
        System.out.println("\nColumn C: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistCcolumn[i] + ", ");
        }
        System.out.println("\nColumn D: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistDcolumn[i] + ", ");
        }
        System.out.println("\nColumn E: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistEcolumn[i] + ", ");
        }
        System.out.println("\nColumn F: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistFcolumn[i] + ", ");
        }
        System.out.println("\nColumn G: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistGcolumn[i] + ", ");
        }
        System.out.println("\nColumn H: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistHcolumn[i] + ", ");
        }
        System.out.println("\nColumn I: ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ": ");
            System.out.print(Variables.sudokuElementExistIcolumn[i] + ", ");
        }
    }
    /*
     squares of sudoku:

     A | B | C
     ---------
     D | E | F
     ---------
     G | H | I

    */
    static void showDetection(char square) {
        switch (square) {
            case 'A':
                System.out.println("\nSquare A:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAsquare[i] + ", ");
                }
                System.out.println("\nSquare B:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBsquare[i] + ", ");
                }
                System.out.println("\nSquare C:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCsquare[i] + ", ");
                }
                System.out.println("\nSquare D:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDsquare[i] + ", ");
                }
                System.out.println("\nSquare G:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGsquare[i] + ", ");
                }
                System.out.println("\nRow A: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistArow[i] + ", ");
                }

                System.out.println("\nRow B: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBrow[i] + ", ");
                }
                System.out.println("\nRow C: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCrow[i] + ", ");
                }
                System.out.println("\nColumn A: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAcolumn[i] + ", ");
                }
                System.out.println("\nColumn B: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBcolumn[i] + ", ");
                }
                System.out.println("\nColumn C: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCcolumn[i] + ", ");
                }
                break;

            case 'B':
                System.out.println("\nSquare A:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAsquare[i] + ", ");
                }
                System.out.println("\nSquare B:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBsquare[i] + ", ");
                }
                System.out.println("\nSquare C:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCsquare[i] + ", ");
                }
                System.out.println("\nSquare E:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEsquare[i] + ", ");
                }
                System.out.println("\nSquare H:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHsquare[i] + ", ");
                }
                System.out.println("\nRow A: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistArow[i] + ", ");
                }

                System.out.println("\nRow B: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBrow[i] + ", ");
                }
                System.out.println("\nRow C: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCrow[i] + ", ");
                }
                System.out.println("\nColumn D: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDcolumn[i] + ", ");
                }
                System.out.println("\nColumn E: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEcolumn[i] + ", ");
                }
                System.out.println("\nColumn F: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFcolumn[i] + ", ");
                }
                break;

            case 'C':
                System.out.println("\nSquare A:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAsquare[i] + ", ");
                }
                System.out.println("\nSquare B:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBsquare[i] + ", ");
                }
                System.out.println("\nSquare C:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCsquare[i] + ", ");
                }
                System.out.println("\nSquare F:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFsquare[i] + ", ");
                }
                System.out.println("\nSquare I:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIsquare[i] + ", ");
                }
                System.out.println("\nRow A: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistArow[i] + ", ");
                }

                System.out.println("\nRow B: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBrow[i] + ", ");
                }
                System.out.println("\nRow C: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCrow[i] + ", ");
                }
                System.out.println("\nColumn G: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGcolumn[i] + ", ");
                }
                System.out.println("\nColumn H: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHcolumn[i] + ", ");
                }
                System.out.println("\nColumn I: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIcolumn[i] + ", ");
                }
                break;

            case 'D':
                System.out.println("\nSquare D:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDsquare[i] + ", ");
                }
                System.out.println("\nSquare E:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEsquare[i] + ", ");
                }
                System.out.println("\nSquare F:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFsquare[i] + ", ");
                }
                System.out.println("\nSquare A:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAsquare[i] + ", ");
                }
                System.out.println("\nSquare G:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGsquare[i] + ", ");
                }
                System.out.println("\nRow D: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDrow[i] + ", ");
                }

                System.out.println("\nRow E: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistErow[i] + ", ");
                }
                System.out.println("\nRow F: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFrow[i] + ", ");
                }
                System.out.println("\nColumn A: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAcolumn[i] + ", ");
                }
                System.out.println("\nColumn B: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBcolumn[i] + ", ");
                }
                System.out.println("\nColumn C: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCcolumn[i] + ", ");
                }
                break;

            case 'E':
                System.out.println("\nSquare D:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDsquare[i] + ", ");
                }
                System.out.println("\nSquare E:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEsquare[i] + ", ");
                }
                System.out.println("\nSquare F:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFsquare[i] + ", ");
                }
                System.out.println("\nSquare B:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBsquare[i] + ", ");
                }
                System.out.println("\nSquare H:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHsquare[i] + ", ");
                }
                System.out.println("\nRow D: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDrow[i] + ", ");
                }

                System.out.println("\nRow E: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistErow[i] + ", ");
                }
                System.out.println("\nRow F: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFrow[i] + ", ");
                }
                System.out.println("\nColumn D: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDcolumn[i] + ", ");
                }
                System.out.println("\nColumn E: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEcolumn[i] + ", ");
                }
                System.out.println("\nColumn F: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFcolumn[i] + ", ");
                }
                break;

            case 'F':
                System.out.println("\nSquare D:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDsquare[i] + ", ");
                }
                System.out.println("\nSquare E:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEsquare[i] + ", ");
                }
                System.out.println("\nSquare F:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFsquare[i] + ", ");
                }
                System.out.println("\nSquare C:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCsquare[i] + ", ");
                }
                System.out.println("\nSquare I:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIsquare[i] + ", ");
                }
                System.out.println("\nRow D: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDrow[i] + ", ");
                }

                System.out.println("\nRow E: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistErow[i] + ", ");
                }
                System.out.println("\nRow F: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFrow[i] + ", ");
                }
                System.out.println("\nColumn G: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGcolumn[i] + ", ");
                }
                System.out.println("\nColumn H: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHcolumn[i] + ", ");
                }
                System.out.println("\nColumn I: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIcolumn[i] + ", ");
                }
                break;

            case 'G':
                System.out.println("\nSquare G:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGsquare[i] + ", ");
                }
                System.out.println("\nSquare H:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHsquare[i] + ", ");
                }
                System.out.println("\nSquare I:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIsquare[i] + ", ");
                }
                System.out.println("\nSquare A:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAsquare[i] + ", ");
                }
                System.out.println("\nSquare D:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDsquare[i] + ", ");
                }
                System.out.println("\nRow G: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGrow[i] + ", ");
                }
                System.out.println("\nRow H: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHrow[i] + ", ");
                }
                System.out.println("\nRow I: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIrow[i] + ", ");
                }
                System.out.println("\nColumn A: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistAcolumn[i] + ", ");
                }
                System.out.println("\nColumn B: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBcolumn[i] + ", ");
                }
                System.out.println("\nColumn C: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCcolumn[i] + ", ");
                }
                break;
            case 'H':
                System.out.println("\nSquare G:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGsquare[i] + ", ");
                }
                System.out.println("\nSquare H:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHsquare[i] + ", ");
                }
                System.out.println("\nSquare I:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIsquare[i] + ", ");
                }
                System.out.println("\nSquare B:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistBsquare[i] + ", ");
                }
                System.out.println("\nSquare E:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEsquare[i] + ", ");
                }
                System.out.println("\nRow G: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGrow[i] + ", ");
                }
                System.out.println("\nRow H: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHrow[i] + ", ");
                }
                System.out.println("\nRow I: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIrow[i] + ", ");
                }
                System.out.println("\nColumn D: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistDcolumn[i] + ", ");
                }
                System.out.println("\nColumn E: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistEcolumn[i] + ", ");
                }
                System.out.println("\nColumn F: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFcolumn[i] + ", ");
                }
                break;

            case 'I':
                System.out.println("\nSquare G:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGsquare[i] + ", ");
                }
                System.out.println("\nSquare H:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHsquare[i] + ", ");
                }
                System.out.println("\nSquare I:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIsquare[i] + ", ");
                }
                System.out.println("\nSquare C:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistCsquare[i] + ", ");
                }
                System.out.println("\nSquare F:");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistFsquare[i] + ", ");
                }
                System.out.println("\nRow G: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGrow[i] + ", ");
                }
                System.out.println("\nRow H: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHrow[i] + ", ");
                }
                System.out.println("\nRow I: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIrow[i] + ", ");
                }
                System.out.println("\nColumn G: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistGcolumn[i] + ", ");
                }
                System.out.println("\nColumn H: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistHcolumn[i] + ", ");
                }
                System.out.println("\nColumn I: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + ": ");
                    System.out.print(Variables.sudokuElementExistIcolumn[i] + ", ");
                }
                break;
        }
    }

    // Showing sudoku table in 9x9 area
    static void showSudoku() {
        System.out.println(" ");
        for (int[] sudokuLine : Variables.sudoku) {
            for (int element : sudokuLine) {
                if (element <= 9)
                    System.out.print(element + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
    }

    // Showing testing value of row, column and temporary variable
    static void testValue(int row, int column, int tmp) {
        System.out.println("row = " + row + ", column = " + column + ", tmp = " + tmp);
        System.out.println();
    }
}
