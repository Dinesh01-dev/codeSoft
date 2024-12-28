package com.dk.main;



import java.util.Scanner;
import java.util.concurrent.*;

import com.dk.config.QuizQuestions;

public class QuizTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=========== Quiz Game =========");
        
        QuizQuestions[] qQuestions = {
            new QuizQuestions("Who is Prime Minister of India", 
                new String[] {"Rahul Gandhi", "Narendra Modi", "Nehru", "Manmohan Singh"}, 2),
            new QuizQuestions("Who is Chief Minister of Telangana", 
                new String[] {"Revanth Reddy", "KCR", "Chandra Babu Naidu", "KTR"}, 1),
            new QuizQuestions("Who is President of India", 
                new String[] {"APJ Abdul Kalam", "KCR", "Chandra Babu Naidu", "Droupadi Murmu"}, 4)
        };

        int score = 0;

        for (QuizQuestions qQ : qQuestions) {
            System.out.println("\n" + qQ.questions);
            for (int i = 0; i < qQ.options.length; i++) {
                System.out.println((i + 1) + ". " + qQ.options[i]);
            }

            System.out.println("Select Your Answer (You have 10 seconds):");
            
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> s.nextInt());

            int userAnswer = -1; // Default

            try {
               
                userAnswer = future.get(5, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                System.out.println("Time's up! Moving to the next question.");
            } catch (Exception e) {
                System.out.println("Invalid input! Moving to the next question.");
            } finally {
                executor.shutdownNow(); 
            }

            // Check answer if it was entered in time
            if (userAnswer == qQ.correctAnswer) {
                System.out.println("Good! Correct Answer!");
                score++;
            } else if (userAnswer != -1) { 
                System.out.println("Oops! Wrong Answer. Correct Answer: " + qQ.options[qQ.correctAnswer - 1]);
            }
        }

        System.out.println("Quiz is Over! Your final score: " + score + " / " + qQuestions.length);
        s.close();
    }
}
