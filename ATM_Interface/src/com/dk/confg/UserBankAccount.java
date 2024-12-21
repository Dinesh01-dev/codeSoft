package com.dk.confg;

public class UserBankAccount {
	private double balance;
	public UserBankAccount(double intialbalance) {
		this.balance=intialbalance;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance =balance+amount;
			System.out.println("Successfully Deposited Amount " +amount);
		}
		else {
			System.out.println("Invalid Amount ");
		}
	}
	public boolean withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance =balance-amount;
			System.out.println("Sucessfully Withdraw: " +amount);
			return true;
		}
		else if(amount>balance) {
			System.out.println("Insufficient Amount:");
			
		}
		else {
			System.out.println("Invalid Amount:");
		}
		return false;
	}
	public double getbalance() {
		return balance;
	}
	

}
