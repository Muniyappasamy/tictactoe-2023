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
}
