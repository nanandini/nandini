package com.xworkz.chaining;

public class ChainRunner {

	public static void main(String[] args) {
		Chain chain = new Chain("Silver Chain");
		System.out.println("type of the chain:" + chain.type);

		Chain chain1 = new Chain("Silver Chain", 240000);
		System.out.println("price of the chain:" + chain1.price);

		Chain chain2 = new Chain("Silver Chain", 240000, 12);
		System.out.println("length of the chain:" + chain2.length);

		Chain chain3 = new Chain("Sliver Chain", 240000, 12, " gold");
		System.out.println("material of the chain:" + chain3.material);

		Chain chain4 = new Chain("Silver Chain", 240000, 12, "gold", "lalitha");
		System.out.println("shop name of the chain:" + chain4.shop);

		Chain chain5 = new Chain("Silver Chain", 240000, 12, "gold", "lalitha", false);
		System.out.println("if stolen the chain:" + chain5.Stolen);

		Chain chain6 = new Chain("Sliver Chain", 240000, 12, "gold", "lalitha", false, true);
		System.out.println("if chain looks fresh:" + chain6.Fresh);

		Chain chain7 = new Chain("Sliver Chain", 240000, 12, "gold", "lalitha", false, true, 75.12);
		System.out.println("weight og the chain:" + chain7.weight);
	}
 
}
