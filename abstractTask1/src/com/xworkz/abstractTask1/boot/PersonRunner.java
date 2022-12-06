package com.xworkz.abstractTask1.boot;

import com.xworkz.abstractTask1.type.Vijayalakshmi;

public class PersonRunner {

	public static void main(String[] args) {
		Vijayalakshmi vijju = new Vijayalakshmi("Nandini", 23, true, "Chikkabalapur", " Female");
		vijju.completeProgram();
		vijju.paidTax(44.12);
		vijju.gst();
		vijju.uploadTask();
		vijju.vat();
		vijju.eat();
		vijju.sleep();

		System.out.println(vijju.getName());
		System.out.println(vijju.getAge());
		System.out.println(vijju.getPlace());
		System.out.println(vijju.getGender());

	}

}
