package ru.est0y.OopQuizAdvanced;

public class Quiz {
    public static void main(String[] args) {
        final Question[] QUESTIONS = {
                new Question("Сколько примитивных типов есть в Java?",
                        new AnswerOptions(new String[]{"100", "5", "1", "8"}),
                        new CorrectNumAnswer(4)
                ),
                new Question("В фаил с каким расширением компилируется java фаил?",
                        new AnswerOptions(new String[]{"cs", "java", "class", "exe"}),
                        new CorrectNumAnswer(3)
                ),
                new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?",
                        new AnswerOptions(new String[]{"commit", "push", "clone", "copy"}),
                        new CorrectNumAnswer(3)
                )
        };
        User user = new User();
        for (Question question : QUESTIONS) {
            question.askQuestion();
            boolean correctnessAnswer = question.checkAnswer(user.getAnswer());
            user.updateCounter(correctnessAnswer);
        }
        user.printResult();
    }
}
