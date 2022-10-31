package ru.est0y.OopQuizAdvanced;

import java.util.Scanner;

public class User {
    private int correctAnswersCount = 0;
    private int wrongAnswersCount = 0;

    public String getAnswer() {
        return new Scanner(System.in).nextLine();
    }

    public void updateCounter(boolean correctnessAnswer) {
        if (correctnessAnswer) {
            this.correctAnswersCount++;
        } else {
            this.wrongAnswersCount++;
        }
    }

    public void printResult() {
        System.out.println("Правильных ответов: " + this.correctAnswersCount +
                ",Неправильных ответов: " + this.wrongAnswersCount);
    }
}
