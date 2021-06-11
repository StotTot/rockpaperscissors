package dev.debride.rockpaperscissors.services;

import dev.debride.rockpaperscissors.models.GameState;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Component
@Service
public class GameStateServiceImpl implements GameStateService {

    // 1 = rock
    // 2 = paper
    // 3 = scissors
    @Override
    public GameState playGame(Integer userInput) {

        GameState newGame = new GameState();

        Random r = new Random();

        int randomInt = r.nextInt(3) + 1;
        System.out.println(randomInt);
        System.out.println(userInput);
        switch (userInput) {
            case 1:
                switch (randomInt) {
                    case 1:
                        newGame.setFlag(true);
                        newGame.setWinner(0);
                        return newGame;
                    case 2:
                        newGame.setFlag(true);
                        newGame.setWinner(2);
                        return newGame;
                    case 3:
                        newGame.setFlag(true);
                        newGame.setWinner(1);
                        return newGame;
                }
            case 2:
                switch (randomInt) {
                    case 1:
                        newGame.setFlag(true);
                        newGame.setWinner(1);
                        return newGame;
                    case 2:
                        newGame.setFlag(true);
                        newGame.setWinner(0);
                        return newGame;
                    case 3:
                        newGame.setFlag(true);
                        newGame.setWinner(2);
                        return newGame;
                }
            case 3:
                switch (randomInt) {
                    case 1:
                        newGame.setFlag(true);
                        newGame.setWinner(2);
                        return newGame;
                    case 2:
                        newGame.setFlag(true);
                        newGame.setWinner(1);
                        return newGame;
                    case 3:
                        newGame.setFlag(true);
                        newGame.setWinner(0);
                        return newGame;
                }

        }


        return null;
    }
}
