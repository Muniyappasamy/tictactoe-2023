package com.tictactoe.tdd.service;

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

        gameService.play(1,2,'O');
        Assertions.assertEquals('O',gameService.board[1][2]);
    }
}
