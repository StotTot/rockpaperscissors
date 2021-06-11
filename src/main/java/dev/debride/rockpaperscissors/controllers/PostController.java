package dev.debride.rockpaperscissors.controllers;

import dev.debride.rockpaperscissors.dtos.GameStateDTO;
import dev.debride.rockpaperscissors.models.GameState;
import dev.debride.rockpaperscissors.services.GameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class PostController {

    @Autowired
    GameStateService gameStateService;

    @PostMapping("/play/{choice}")
    public ResponseEntity<GameStateDTO> playGame(@PathVariable(name = "choice") int choice) {

        GameStateDTO gameStateDTO = new GameStateDTO(gameStateService.playGame(choice));

        return ResponseEntity.status(200).body(gameStateDTO);
    }
}
