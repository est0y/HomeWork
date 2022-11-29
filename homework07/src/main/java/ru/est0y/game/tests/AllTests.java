package ru.est0y.game.tests;

import ru.est0y.game.tests.unit.DiceImplTest;
import ru.est0y.game.tests.unit.GameTest;

public class AllTests {
    public static void main(String[] args) {
        new DiceImplTest().rollRangeTest();
        new DiceImplTest().randomnessRollTest();

        new GameTest().testPlayGameWithSameDiceRollResult();
        new GameTest().testPlayGameWhenFirstRollGreaterThanSecond();
        new GameTest().testPlayGameWhenSecondRollGreaterThanFirst();
    }
}
