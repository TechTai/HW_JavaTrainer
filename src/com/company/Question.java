package com.company;

public class Question {
    private String [] options;
    private String question;
    private int correctAnswer;

    public Question(String [] options, String question, int correctAnswer) {
        this.options = options;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer(){

        return correctAnswer;
    }

    public String getQuestion(){

        return question;
    }
}
