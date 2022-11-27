package com.xworkz.overriding.boot;

import com.xworkz.overriding.custom.Jail;

public class PgRunner {

	public static void main(String[] args) {

		Jail jail = new Jail();
		jail.location();
		jail.pgName();

	}

}
