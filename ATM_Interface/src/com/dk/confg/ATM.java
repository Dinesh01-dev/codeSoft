package com.dk.confg;

import java.util.Scanner;

public class ATM {
	private UserBankAccount account;
	
	public ATM(UserBankAccount account) {
		this.account=account;
	}
	Scanner sc=new Scanner(System.in);
	
	public void display() {
		System.out.println("==============\nATM Menu===========");
		System.out.println("\n\t1.Check Balance"
		                   +"\n\t2.Deposit Money"
				           +"\n\t3.Withdraw Money"
		                   +"\n\t4.Exit");
		System.out.println("**********Enter the choice*************");
	}
		 public void startProcess() {
			 
			 boolean running= true;
			 
			 while(running) {
				 display();
				
					 int choice=sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Your current balance is "+account.getbalance());
						break;
					case 2:
						System.out.println("Enter the deposit amount");
						double depositAmt=sc.nextDouble();
						account.deposite(depositAmt);
						break;
					case 3:
						System.out.println("Enter the withdraw amount");
						double withdw=sc.nextDouble();
						account.withdraw(withdw);
						break;
					case 4:
						running=false;
						System.out.println("Thank You Visit Again!");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				 
			 }
					
		 
		
		
	}

}
