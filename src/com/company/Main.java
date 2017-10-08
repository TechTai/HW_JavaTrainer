package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        promptUser();
        Scanner in = new Scanner(System.in);
        startProgram(in);
    }

    private static void startProgram(Scanner in) {
        while (in.hasNext()) {
            boolean quit = false;
            int userChoice = 0;
            String error = "Please enter a number.";

            try {
                userChoice = Integer.parseInt(in.next());
            } catch (NumberFormatException e) {
                System.out.println(error);
                System.out.println();
                promptUser();
            }

            if (userChoice > 0 && userChoice <= 3) {
                if (userChoice == 1) {
                    System.out.println("You have selected Java Trainer as your study method.");
                    Study.startStudyTrainer();
                    System.out.println();
                    System.out.println("Welcome to the Java Trainer.");
                    System.out.println();
                    promptUser();
                } else if (userChoice == 2) {
                    System.out.println("You selected to initiate the Java quiz.");
                    Quiz.startQuiz();
                } else if (userChoice == 3) {
                    System.out.println("Thank you for using the M&T Java Helper. Happy studying.");
                    quit = true;
                }
            } else if (userChoice > 3 || userChoice == 0) {
                System.out.println("Please enter a valid option number. 1 - Java Trainer or 2 - Java Quiz");
                promptUser();
            } else {
                continue;
            }
            if (quit) {
                break;
            }
        }
    }

    //          Option #1
    private static void Study() {
        System.out.println("You have selected the Java Trainer.");
        Study.startStudyTrainer();
        System.out.println();
        System.out.println("Let's get started!");
    }

    //              Option #2
    private static void Quiz() {
        System.out.println("You have selected the Java Study Guide.");
        Quiz.startQuiz();
        System.out.println();
        System.out.println("Let's get started!");
    }

    private static void promptUser() {
        System.out.println("Welcome to the M&T Java Helper. Please select your review method.");
        System.out.println();
        System.out.println("Option 1: Java Trainer - Review definitions of Java programming terms.");
        System.out.println("Option 2: Java Quiz - Review your Java knowledge with our exercises.");
        System.out.println("Option 3: End M&T Java Helper.");
    }

}

