package dev.debride.rockpaperscissors.models;

public class GameState {

    private boolean flag = false;

    // 0 = tie
    // 1 = player
    // 2 = cpu
    private int winner;

    public GameState() {

    }

    public GameState(boolean flag) {
        this.flag = flag;
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
        return "GameState{" +
                "flag=" + flag +
                ", winner=" + winner +
                '}';
    }
}
