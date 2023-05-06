package com.tictactoe.tdd.service;

import com.tictactoe.tdd.model.Player;

public class GameService {

    char[][] board;
    private static final int BOARD_NUMBER = 3;

    public GameService() {

        board = new char[BOARD_NUMBER][BOARD_NUMBER];

    }

    public void play(Player player) {

        board[player.getRowIndex()][player.getColumnIndex()] = player.getPlayerId();

    }

    public Boolean horizontalOrVeritcalWinStatus(char playerId, char flag) {

        for (int row = 0; row < BOARD_NUMBER; row++) {
            int totalPostion = 0;
            for (int col = 0; col < BOARD_NUMBER; col++) {
                if (flag == 'H' && board[row][col] == playerId) {
                    totalPostion++;
                } else if (flag == 'V' && board[col][row] == playerId) {
                    totalPostion++;
                }
            }
            if (totalPostion == BOARD_NUMBER) {

                return true;
            }
        }
        return false;

    }

    public String checkMatchInprogressOrDraw() {
        int xCounter = 0;
        int oCounter = 0;
        for (int row = 0; row < BOARD_NUMBER; row++) {
            for (int col = 0; col < BOARD_NUMBER; col++) {
                if (board[row][col] == 'X') {
                    xCounter++;
                } else if (board[row][col] == 'O') {
                    oCounter++;
                }
            }
        }
        if (xCounter > oCounter && (xCounter + oCounter == BOARD_NUMBER * BOARD_NUMBER)) {
            return "Draw";
        }
        return "InProgress";
    }

    public String findGameState() {

        if (horizontalOrVeritcalWinStatus('X', 'H') ||
                horizontalOrVeritcalWinStatus('X', 'V') ||
                diagonalOneOrTwoWinCase('X', 'O') ||
                diagonalOneOrTwoWinCase('X', 'T')) {
            return "Player X WON";
        } else if (horizontalOrVeritcalWinStatus('O', 'H') ||
                horizontalOrVeritcalWinStatus('O', 'V') ||
                diagonalOneOrTwoWinCase('O', 'O') ||
                diagonalOneOrTwoWinCase('O', 'T')) {
            return "Player O WON";
        } else {
            return checkMatchInprogressOrDraw();
        }

    }

    public Boolean diagonalOneOrTwoWinCase(char playerId, char flag) {
        int row = 0;
        int col = 0;
        if (flag == 'T') {
            col = BOARD_NUMBER - 1;
        }
        int totalposition = 0;
        for (; row < BOARD_NUMBER; ) {

            if (board[row][col] == playerId) {
                totalposition++;
            }
            if (flag == 'T') {
                col--;
            } else {
                col++;
            }
            row++;
        }
        if (totalposition == BOARD_NUMBER) {
            return true;
        }
        return false;

    }

}
