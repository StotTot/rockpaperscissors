package dev.debride.rockpaperscissors.services;

import dev.debride.rockpaperscissors.models.GameState;

public interface GameStateService {
    GameState playGame(Integer userInput);
}
