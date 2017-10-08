package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    public static void startQuiz() {
        buildMap();
        promptUser();
    }

    private static void promptUser() {
        System.out.println("Let's get started! When ready to exit the guide, type 0 or quit.");
        System.out.println();
        System.out.println("Welcome to the Java Quiz - Review your Java knowledge with our exercises.");
    }

    private static void buildMap() {
        String[] answerChoices = {"1 - class", "2 - object", "3 - method", "4 - superclass", "5 - instance variable"};

        Question question1 = new Question(answerChoices, "Question 1: I am compiled from a .java file. What am I?", 1);
        Question question2 = new Question(answerChoices, "Question 2: I represent 'state'. What am I?", 5);
        Question question3 = new Question(answerChoices, "Question 3: My instance variables can be different from my buddy's values. What am I?", 2);
        Question question4 = new Question(answerChoices, "Question 4: I represent 'behavior'. What am I?", 3);
        Question question5 = new Question(answerChoices, "Question 5: I am linked to subclasses through inheritance. What am I?", 4);


        List<Question> awesome = new ArrayList<>();
        awesome.add(question1);
        awesome.add(question2);
        awesome.add(question3);
        awesome.add(question4);
        awesome.add(question5);

        for (int i = 0; i < awesome.size(); i++) {
            Question question = awesome.get(i);
            System.out.println(question.getQuestion());

            for (int j = 0; j < answerChoices.length; j++) {
                System.out.println(answerChoices[j]);
            }
            System.out.println();
            System.out.println("Please enter your answer.");
            Scanner in = new Scanner(System.in);
            int userAnswer = in.nextInt();

            if (userAnswer == question.getCorrectAnswer()) {
                System.out.println("Your answer is correct - Great job!");
            } else {
                System.out.println("Your answer is incorrect. Keep studying, peer programming and taking advantage of Teaching Assistant (TA) office hours.");
            }
            System.out.println();
        }
    }
}


