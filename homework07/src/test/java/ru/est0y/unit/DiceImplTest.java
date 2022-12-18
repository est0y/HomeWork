package ru.est0y.unit;

import org.junit.Assert;
import org.junit.Test;
import ru.est0y.game.app.DiceImpl;


public class DiceImplTest {
    @Test
    public void rollRangeTest() {
        String scenario = "Тест на соответствие диапазону 1-6";
        DiceImpl dice = new DiceImpl();
        for (int i = 1; i <= 10; i++) {
            int value = dice.roll();
            if (!(value >= 1 && value <= 6)) {
                Assert.fail(scenario + " fails with value " + value);
                return;
            }
        }
        System.out.printf("\"%s\" passed %n", scenario);
    }

    @Test
    public void randomnessRollTest() {
        String scenario = "Тест на рандомность";
        DiceImpl dice = new DiceImpl();
        for (int i = 1; i <= 10; i++) {
            if (dice.roll() != dice.roll()) {
                System.out.printf("\"%s\" passed %n", scenario);
                return;
            }
        }
        System.err.printf("\"%s\" fails%n", scenario);
    }
}
