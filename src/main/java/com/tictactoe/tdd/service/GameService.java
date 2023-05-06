package com.tictactoe.tdd.service;

public class GameService {

    char[][] board;
    private static final int BOARD_NUMBER = 3;

    public GameService(){

        board = new char[BOARD_NUMBER][BOARD_NUMBER];

    }
    public void play(int row,int col, char playerId){

        board[row][col] = playerId;

    }
}
