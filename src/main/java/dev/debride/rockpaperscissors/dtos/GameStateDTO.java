package dev.debride.rockpaperscissors.dtos;

import dev.debride.rockpaperscissors.models.GameState;

public class GameStateDTO {

    private boolean flag = false;

    private int winner;

    public GameStateDTO(){

    }

    public GameStateDTO(GameState gameState) {
        this.flag = gameState.isFlag();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "GameStateDTO{" +
                "flag=" + flag +
                ", winner=" + winner +
                '}';
    }
}
