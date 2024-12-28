package com.dk.main;

import java.util.List;
import java.util.Scanner;

import com.dk.config.QuizQuestions;

public class QuizTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("===========Quiz Game=========");
		QuizQuestions[] qQuestions= {
				                        new QuizQuestions("Who is Prime Minister of Inida", new String[] {"Rahul Gandi","NarendraModi","Nehru","ManMohan Singh"}, 2),
				                        new QuizQuestions("Who is Cheif Minister of Telangana", new String[] {"Revanth Reddy","KCR","Chandra Babu Naidu","KTR"}, 1),
				                        new QuizQuestions("Who is  President of India", new String[] {"APJ Abdul Kalam","KCR","Chandra Babu Naidu","Dravupathi Mumur"}, 4)
		};
		
		int score=0;
		
		for(QuizQuestions qQ: qQuestions) {
			System.out.println("\n" + qQ.questions);
			for(int i=0;i<qQ.options.length;i++) {
				System.out.println((i+1)+ "." + qQ.options[i]);
			}
			
			System.out.println("Select Your Answer::");
			int userAnswer=s.nextInt();
			
			
			if(userAnswer==qQ.correctAnswer) {
				System.out.println("Good Correct Answer!");
				score++;
			}
			else {
				System.out.println("Oops! Wrong Answwer "+"correct Answer:: "+qQ.options[qQ.correctAnswer-1]);
			}
			
		}
		System.out.println("Quiz is Over And your final Score "+score+ "/"+qQuestions.length);
		s.close();

	}

}
