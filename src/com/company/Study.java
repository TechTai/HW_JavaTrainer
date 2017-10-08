package com.company;
import java.util.HashMap;
import java.util.Scanner;

//Dictionary of Java terms
public class Study {
    private static HashMap<String,String> termsData; //global variable also called a field

    public static void startStudyTrainer(){
        initializeMap();
        promptUser();
        startProgram();
    }

        private static void initializeMap() {
        termsData = new HashMap<String, String>();
        termsData.put("abstract", "A keyword used in a class definition to show that the class is not to be instantiated.");
        termsData.put("array", "A collection of data items.");
        termsData.put("comment", "Text in the code that is ignored by the compiler.");
        termsData.put("constructor", "A pseudo method that creates an object.");
        termsData.put("int", "A keyword used to define a variable of the integer type.");
        }

        private static void promptUser(){
            System.out.println("Let's get started! When ready to exit the guide, type 0 or quit.");
            System.out.println();
            System.out.println("Welcome to the study guide for Java programming language.");
            System.out.println();
            System.out.println("Please enter one of these term for its definition - Abstract, Array, Comment, Constructor, Int");
        }

        private static void startProgram() {
            Scanner in = new Scanner(System.in);
            System.out.println();
            while(in.hasNext()) {
                String userTerm = in.next();

                if(userTerm.equals("quit")|| userTerm.equals("0")){
                    System.out.println("Thank you for using the M&T study guide.");
                    break;
                }
                if(termsData.containsKey(userTerm.toLowerCase())){
                    System.out.println("You entered: " + userTerm);
                    System.out.println(termsData.get(userTerm));
                    System.out.println();
                    System.out.println("Please select another term.");
                } else{
                    System.out.println("Study guide doesn't contain this term.");
                    String userAnswer = in.next();
                    if(userAnswer.toLowerCase().equals("y")) {
//                        add to map
                        System.out.println("Please enter a term: ");
                        String key = in.next().toLowerCase();
                        System.out.println("Please enter the term's definition:");
                        String value = in.next();
                        termsData.put(key,value);
                        System.out.println("Thank you. Your Java programming term has been added to the study guide.");
                    }else {
                        System.out.println("Would you like to end the study guide?");
                        String answer = in.next();
                        if (answer.toLowerCase().equals("y")) {
                            break;
                        } else {
                            System.out.println("Let's restart the study guide!");
                            promptUser();
                        }
                    }
            }   }
        }
    }


