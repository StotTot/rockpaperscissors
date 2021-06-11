package dev.debride.rockpaperscissors.serviceTests;

import dev.debride.rockpaperscissors.models.GameState;
import dev.debride.rockpaperscissors.services.GameStateServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStateServiceTest {
    GameStateServiceImpl gameService = new GameStateServiceImpl();

    @Test
    void gameEnds_WhenSomeoneWins() {
        GameState newGameState = gameService.playGame(1);
        System.out.println(newGameState.toString());
        Assertions.assertTrue(newGameState.isFlag());
    }
}
