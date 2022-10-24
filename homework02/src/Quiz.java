import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        final String[] QUESTIONS = {
                "Сколько примитивных типов есть в Java?",
                "В фаил с каким расширением компилируется java фаил?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?"
        };
        final String[][] ANSWER_OPTIONS = {
                {"100", "5", "1", "8"},
                {"cs", "java", "class", "exe"},
                {"commit", "push", "clone", "copy"}
        };
        final int[] CORRECT_NUM_ANSWERS = new int[]{4, 3, 3};
        for (int i = 0; i < QUESTIONS.length; i++) {
            askQuestion(QUESTIONS[i], ANSWER_OPTIONS[i]);
            if (getNumUserAnswer() == CORRECT_NUM_ANSWERS[i]) {
                System.out.println("правильно");
                correctCount++;
            } else {
                System.out.println("неправильно");
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

    private static void askQuestion(String question, String[] answerOptions) {
        System.out.println(question);
        for (int i = 0; i < answerOptions.length; i++) {
            int optionNum = i + 1;
            System.out.println(optionNum + ":" + answerOptions[i]);
        }
        System.out.println("Введите номер ответа:");
    }

    private static int getNumUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }
}
