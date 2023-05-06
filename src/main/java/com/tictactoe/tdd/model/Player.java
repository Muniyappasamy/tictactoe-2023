package com.tictactoe.tdd.model;

public class Player {

    char playerId;
    int rowIndex;
    int columnIndex;

    public Player(char playerId, int rowIndex, int columnIndex) {
        this.playerId = playerId;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public char getPlayerId() {
        return playerId;
    }

    public void setPlayerId(char playerId) {
        this.playerId = playerId;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }
}
