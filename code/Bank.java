package com.xworkz.cmethods.ctype;

public class Bank {

	public String name;
	public String location;
	public int days;
	public boolean good;
	public String type;

	public String[] bankHolderNames;
	public String[] typesOfTransactions;
	public double[] amount;
	public boolean[] overAll;
	public String[] branches;
    
	public Bank(String name, String location, int days, boolean good, String type, String[] bankHolderNames,
			String[] typesOfTransactions, double[] amount, boolean[] overAll, String[] branches) {

		this.name = name;
		this.location = location;
		this.days = days;
		this.good = good;
		this.type = type;
		this.bankHolderNames = bankHolderNames;
		this.typesOfTransactions = typesOfTransactions;
		this.amount = amount;
		this.overAll = overAll;
		this.branches = branches;

		System.out.println("Excuting the Bank Details");
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("location:" + this.location);
		System.out.println("days:" + this.days);
		System.out.println("good:" + this.good);
		System.out.println("type:" + this.type);

		for (int i = 0; i < this.bankHolderNames.length; i++) {
			String string = this.bankHolderNames[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.typesOfTransactions.length; i++) {
			String string = this.typesOfTransactions[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.amount.length; i++) {
			double string = this.amount[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.overAll.length; i++) {
			boolean string = this.overAll[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.branches.length; i++) {
			String string = this.branches[i];
			System.out.println(string);
		}
	}
}
