package com.dk.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
		
		int score=0;
		
		boolean onceMore=true;
		System.out.println("-------------------------------");
		System.out.println("Welcom Your Game Starts Now Lets Go....");
	     
		while(onceMore) 
		{
			int playtoGuess=ran.nextInt(100)+1;
			int attempts=3;
			boolean goodGuess=false;
			
			System.out.println("\npick up the number between 0 to 100:Can You guess it?");
			
			System.out.println("You Have Only " + attempts + " Enter the Number");
			
			for(int i=1;i<=attempts;i++) {
				int playerChance=s.nextInt();
				
				 if(playerChance==playtoGuess) 
				 {
					 System.out.println("Keep going you have Guessed the Correct number Well Done");
					 goodGuess=true;
					 score++;
					 break;
					 
				 }
				 else if(playerChance<playtoGuess)
				 {
					 System.out.println("To low");
				 }
				 else
				 {
					 System.out.println("To high");
				 }
				 
			}
			if(!goodGuess)
			{
				System.out.println("You have Done With All you Attempts..Correct number is::"+ playtoGuess);
			}
			
			System.out.println("Your current Score is:: "+ score);
			System.out.println("Do want to play Again?(YES/NO)");
			String start=s.next();
			
	       onceMore	=start.equalsIgnoreCase("yes");
	       
		}
		System.out.println("ThankYou Your Highest Score is:: "+ score);
		s.close();
	}

}
