package com.dk.main;

import com.dk.confg.ATM;
import com.dk.confg.UserBankAccount;

public class TestMain {
	public static void main(String[] args) {
		UserBankAccount ub=new UserBankAccount(15000.0);
		ATM atm=new ATM(ub);
		atm.startProcess();
	}
	

}
