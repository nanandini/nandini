package com.xworkz.cmethods.boot;

import com.xworkz.cmethods.ctype.*;

public class BankRunner {

	public static void main(String[] args) {
		String[] bankHolderNames = { "NANDINI", "UDAY", "SRIRAM", "RAMYA" };
		String[] typesOfTransactions = { "bankdeposite", "ATM", "byThroughMoblie", "phonePay" };
		double[] amount = { 20000, 25000, 40000, 6000 };
		boolean[] overAll = { true, true, false };
		String[] branches = { "karnataka", "SBM", "graminBank", "axis" };

		Bank bank = new Bank("KARNATAKA BANK", "DEVANAHALLI", 5, true, "phonepay", bankHolderNames, typesOfTransactions,
				amount, overAll, branches);
		bank.display();
	}

}
