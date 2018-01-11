package com.kodilla.sudoku;

public class SudokuGame {

    private boolean resolveSudoku;



    public static void main (String[] args) {
        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.isResolveSudoku();
        }
    }
    public boolean isResolveSudoku() {
        while (resolveSudoku)
            return resolveSudoku;
    }
}
