package ru.est0y.game.tests.unit;

import ru.est0y.assertions.Assertions;
import ru.est0y.game.app.Dice;
import ru.est0y.game.app.Game;
import ru.est0y.game.app.Player;
import ru.est0y.game.tests.fakes.FakeDice;
import ru.est0y.game.tests.fakes.GameWinnerPrinterSpy;

public class GameTest {
    private String getWinnerName(Player player1, Player player2, Dice fakeDice) {
        GameWinnerPrinterSpy gameWinnerPrinterSpy = new GameWinnerPrinterSpy();
        Game game = new Game(fakeDice, gameWinnerPrinterSpy);
        game.playGame(player1, player2);
        return gameWinnerPrinterSpy.getWinnerName();
    }

    public void testPlayGameWithSameDiceRollResult() {
        String scenario = "Тест с одинаковым результатом бросков кубика";
        try {
            Player firstPlayer = new Player("Первый игрок");
            Player secondPlayer = new Player("Второй игрок");
            Dice firstTwoSameResults = FakeDice.getDiceWithDefiniteResults(4, 4, 1, 2);
            String winnerName = getWinnerName(firstPlayer, secondPlayer, firstTwoSameResults);
            Assertions.assertEquals(secondPlayer.getName(), winnerName);

            firstTwoSameResults = FakeDice.getDiceWithDefiniteResults(4, 4, 2, 1);
            winnerName = getWinnerName(firstPlayer, secondPlayer, firstTwoSameResults);
            Assertions.assertEquals(firstPlayer.getName(), winnerName);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPlayGameWhenFirstRollGreaterThanSecond() {
        String scenario = "Тест когда первый бросок больше второго";
        try {
            Player firstPlayer = new Player("Первый игрок");
            Player secondPlayer = new Player("Второй игрок");
            Dice firstRollGreaterThanSecond = FakeDice.getDiceWithDefiniteResults(100, 1);
            String winnerName = getWinnerName(firstPlayer, secondPlayer, firstRollGreaterThanSecond);
            Assertions.assertEquals(firstPlayer.getName(), winnerName);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPlayGameWhenSecondRollGreaterThanFirst() {
        String scenario = "Тест когда второй бросок больше первого";
        try {
            Player firstPlayer = new Player("Первый игрок");
            Player secondPlayer = new Player("Второй игрок");
            Dice firstRollGreaterThanSecond = FakeDice.getDiceWithDefiniteResults(1, 100);
            String winnerName = getWinnerName(firstPlayer, secondPlayer, firstRollGreaterThanSecond);
            Assertions.assertEquals(secondPlayer.getName(), winnerName);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }


}
