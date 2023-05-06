package com.tictactoe.tdd.service;

import com.tictactoe.tdd.model.Player;

public class GameService {

    char[][] board;
    private static final int BOARD_NUMBER = 3;

    public GameService(){

        board = new char[BOARD_NUMBER][BOARD_NUMBER];

    }
    public void play(Player player){

        board[player.getRowIndex()][player.getColumnIndex()] = player.getPlayerId();

    }

}
