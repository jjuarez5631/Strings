package com.example.java;
import java.util.Scanner;

public class Main {
    //program will ask the user 5 easy questions
    //it will compare the answer and let the user know if it is right or wrong
    //it will then grade the quiz and let the user know how many they got right.

    public static void main(String[] args) {
        int totalCorrect = 0;
        String userAnswer;
        String answerQ1 = "Springfield";
        String answerQ2 = "Earth";
        String answerQ3 = "Wheels";
        String answerQ4 = "Yellow";
        String answerQ5 = "Washington";

        Scanner input = new Scanner(System.in);

        System.out.println("Quiz");
        System.out.println("Fill in the Blank");
            //Question 1
        System.out.println("\nThe capital of Illinois is ____.?");
        userAnswer = input.next();
        if (userAnswer.equalsIgnoreCase(answerQ1)) {    //compare the answer to the question
            System.out.println("Correct!");             //tell the user it is correct or incorrect
            totalCorrect++;
        }else {                         //display the correct answer if user got it incorrect
            System.out.println("Incorrect! \nAnswer is: " + answerQ1);
        }
            //Question 2
        System.out.println("\nWe live on planet _____.");
        userAnswer = input.next();
        if (userAnswer.equalsIgnoreCase(answerQ2)) {    //compare the answer to the question
            System.out.println("Correct!");             //tell the user it is correct or incorrect
            totalCorrect++;
        }else {                          //display the correct answer if user got it incorrect
            System.out.println("Incorrect! \nAnswer is: " + answerQ2);
        }
            //Question 3
        System.out.println("\nA bicycle has two round _____");
        userAnswer = input.next();
        if (userAnswer.equalsIgnoreCase(answerQ3)) {    //compare the answer to the question
            System.out.println("Correct!");             //tell the user it is correct or incorrect
            totalCorrect++;
        }else {                         //display the correct answer if user got it incorrect
            System.out.println("Incorrect! \nAnswer is: " + answerQ3);
        }

        //Question 4
        System.out.println("\nThe sun is the color _____.");
        userAnswer = input.next();
        if (userAnswer.equalsIgnoreCase(answerQ4)) {    //compare the answer to the question
            System.out.println("Correct!");             //tell the user it is correct or incorrect
            totalCorrect++;
        }else {                         //display the correct answer if user got it incorrect
            System.out.println("Incorrect! \nAnswer is: " + answerQ4);
        }

        //Question 5
        System.out.println("\nThe first US president was George _____");
        userAnswer = input.next();
        if (userAnswer.equalsIgnoreCase(answerQ5)) {    //compare the answer to the question
            System.out.println("Correct!");             //tell the user it is correct or incorrect
            totalCorrect++;
        }else {                         //display the correct answer if user got it incorrect
            System.out.println("Incorrect! \nAnswer is: " + answerQ5);
        }
            //display to the user how many they got wrong
        System.out.println("\nGrade: " + totalCorrect + "/5 correct.");
    }
}
