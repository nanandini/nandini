package com.xworkz.associations.boot;

import com.xworkz.associations.relations.Shape;
import com.xworkz.associations.stype.Piller;

public class PillerRunner {

	public static void main(String[] args) {

		Piller piller = new Piller(43, Shape.CIRCULAR, 23.3f, "iron");
		piller.display();
	}

}
