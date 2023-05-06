package com.tictactoe.tdd.service;

public class GameService {

    char[][] board = new char[3][3];

    public void play(int i,int j, char playerId){

        board[i][j] = playerId;

    }
}
