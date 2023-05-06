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

    public Boolean horizontalWinStatus(char playerId){

        for(int row=0;row<BOARD_NUMBER;row++){
            int totalPostion =0;
            for(int col=0;col<BOARD_NUMBER;col++){
                if(board[row][col] == playerId){
                    totalPostion ++;
                }
            }
            if(totalPostion == BOARD_NUMBER){

                return true;
            }
        }
        return false;

    }

}
