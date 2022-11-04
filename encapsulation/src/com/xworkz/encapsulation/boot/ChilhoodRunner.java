package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.Childhood;
import com.xworkz.encapsulation.type.ChildhoodInside;

public class ChilhoodRunner {

	public static void main(String[] args) {
		ChildhoodInside ChildhoodInside = new ChildhoodInside();
		ChildhoodInside.display();
		Childhood memo = new Childhood();
		memo.setChildhoodName("brunda");
		System.out.println(memo.getChildhoodName());
		memo.setMemories("DANCING");
		System.out.println(memo.getMemories());

	}

}
