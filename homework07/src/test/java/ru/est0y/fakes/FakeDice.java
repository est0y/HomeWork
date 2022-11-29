package ru.est0y.fakes;

import ru.est0y.game.app.Dice;

public class FakeDice {
    public static Dice getDiceWithDefiniteResults(int... results) {
        return new Dice() {

            private int callCount = 0;

            @Override
            public int roll() {
                callCount++;
                try {
                    return results[callCount - 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new IllegalArgumentException("Передано неверное колличество результатов", e);
                }
            }
        };
    }
}
