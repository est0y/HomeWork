package ru.est0y.fakes;

import ru.est0y.game.app.GameWinnerPrinter;
import ru.est0y.game.app.Player;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {
    private Player winner;

    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public String getWinnerName() {
        return this.winner.getName();
    }
}
