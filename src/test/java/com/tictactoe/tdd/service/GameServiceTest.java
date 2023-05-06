package com.tictactoe.tdd.service;

import com.tictactoe.tdd.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameServiceTest {

    GameService gameService;

    @BeforeEach
    void setup(){

        gameService = new GameService();
    }
    @Test
    public void checkGameServiceInstance(){

        Assertions.assertNotNull(gameService);

    }


    @Test
    public void shouldPlacePlayerOinSpecifiedPosition(){

        Player player = new Player('O',1,2);
        gameService.play(player);
        Assertions.assertEquals('O',gameService.board[1][2]);
    }
    @Test
    public void shouldPlacePlayerXinSpecifiedPosition(){
        Player player = new Player('X',1,1);
        gameService.play(player);
        Assertions.assertEquals('X',gameService.board[1][1]);
    }
    @Test
    public void addingbothPlayersToPlay(){

        Player player1 = new Player('X',1,1);
        Player player2 = new Player('O',1,2);

        gameService.play(player1);
        gameService.play(player2);

        Assertions.assertEquals('O',gameService.board[1][2]);
        Assertions.assertEquals('X',gameService.board[1][1]);
    }

    @Test
    public void playerXhorizontalWinTestFirstRow(){
        Player play1 = new Player('X',0,0);
        Player play2 = new Player('X',0,1);
        Player play3 = new Player('X',0,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('X','H'));
    }
    @Test
    public void playerXhorizontalWinTestSecondRow(){
        Player play1 = new Player('X',1,0);
        Player play2 = new Player('X',1,1);
        Player play3 = new Player('X',1,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('X','H'));
    }
    @Test
    public void playerXhorizontalWinTestThirdRow(){
        Player play1 = new Player('X',2,0);
        Player play2 = new Player('X',2,1);
        Player play3 = new Player('X',2,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('X','H'));
    }
    @Test
    public void playerOhorizontalWinTestFirstRow(){
        Player play1 = new Player('O',0,0);
        Player play2 = new Player('O',0,1);
        Player play3 = new Player('O',0,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('O','H'));
    }
    @Test
    public void playerXverticalWinTestFirstCol(){
        Player play1 = new Player('X',0,0);
        Player play2 = new Player('X',1,0);
        Player play3 = new Player('X',2,0);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('X','V'));
    }
    @Test
    public void playerXverticalWinTestSecondCol(){
        Player play1 = new Player('X',0,1);
        Player play2 = new Player('X',1,1);
        Player play3 = new Player('X',2,1);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('X','V'));
    }
    @Test
    public void playerXhorizontalWinTestThirdCol(){
        Player play1 = new Player('X',0,2);
        Player play2 = new Player('X',1,2);
        Player play3 = new Player('X',2,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('X','V'));
    }
    @Test
    public void playerOhorizontalWinTestFirstCol(){
        Player play1 = new Player('O',0,0);
        Player play2 = new Player('O',1,0);
        Player play3 = new Player('O',2,0);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.horizontalOrVeritcalWinStatus('O','V'));
    }

    @Test
    public void playerODiagonalOneWinCase(){
        Player play1 = new Player('O',0,0);
        Player play2 = new Player('O',1,1);
        Player play3 = new Player('O',2,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.diagonalOneWinCase('O'));
    }
    @Test
    public void playerXDiagonalOneWinCase(){
        Player play1 = new Player('X',0,0);
        Player play2 = new Player('X',1,1);
        Player play3 = new Player('X',2,2);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.diagonalOneWinCase('X'));
    }
    @Test
    public void failedplayerXDiagonalOneWinCase(){
        Player play1 = new Player('X',0,0);
        Player play2 = new Player('X',1,1);
        Player play3 = new Player('X',2,0);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(false,gameService.diagonalOneWinCase('X'));
    }
    @Test
    public void playerXDiagonalTwoWinCase(){
        Player play1 = new Player('X',0,2);
        Player play2 = new Player('X',1,1);
        Player play3 = new Player('X',2,0);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(true,gameService.diagonalTwoWinCase('X'));
    }
    @Test
    public void failedplayerXDiagonalTwoWinCase(){
        Player play1 = new Player('X',0,2);
        Player play2 = new Player('X',1,2);
        Player play3 = new Player('X',2,0);

        gameService.play(play1);
        gameService.play(play2);
        gameService.play(play3);


        Assertions.assertEquals(false,gameService.diagonalTwoWinCase('X'));
    }

}
