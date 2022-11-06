package ru.est0y.OopQuiz;

public class Question {
    private final String questionText;
    private final AnswerOptions answerOptions;
    private final Correct correctAnswer;
    public Question(String questionText, AnswerOptions answerOptions, Correct correctAnswer){
        this.questionText=questionText;
        this.answerOptions=answerOptions;
        this.correctAnswer=correctAnswer;
    }
    public  Question(String questionText,Correct correctAnswer){
        this.questionText=questionText;
        this.correctAnswer=correctAnswer;
        this.answerOptions=null;
    }
    public void askQuestion(){
        System.out.println(this.questionText);
        this.printAnswerOptions();
        this.correctAnswer.printRequirement();
    }
    public boolean checkAnswer(String answer){
        return (this.correctAnswer.checkCorrectness(answer));
    }
    private void printAnswerOptions(){
        if (this.answerOptions==null)return;
        this.answerOptions.printOptions();
    }
}
