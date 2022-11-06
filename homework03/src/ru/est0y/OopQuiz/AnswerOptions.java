package ru.est0y.OopQuiz;

public class AnswerOptions {
    private final String[] options;

    public AnswerOptions(String[] options) {
        this.options = options;
    }

    public void printOptions() {
        for (int i = 0; i < this.options.length; i++) {
            int optionNum = i + 1;
            System.out.println(optionNum + ":" + this.options[i]);
        }
    }
}
