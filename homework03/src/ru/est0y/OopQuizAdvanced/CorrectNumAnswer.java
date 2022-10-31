package ru.est0y.OopQuizAdvanced;

public class CorrectNumAnswer implements Correct {
    private final int correctNumAnswer;

    public CorrectNumAnswer(int correctNumAnswer) {
        this.correctNumAnswer = correctNumAnswer;
    }

    public void printRequirement() {
        System.out.println("Введите номер ответа:");
    }

    @Override
    public boolean checkCorrectness(String numAnswer) {
        return numAnswer.equals(String.valueOf(this.correctNumAnswer));
    }
}
