package com.xworkz.associations.stype;

import com.xworkz.associations.relations.Shape;

public class Piller {
	public int id;
	public Shape shape = Shape.CIRCULAR;// enum
	public float height;
	public String supporting;
	public Company company=new Company("TMT", "iron");//co

	public Piller(int id, Shape shape, float height, String supporting) {
		super();
		this.id = id;
		this.shape = shape;
		this.height = height;
		this.supporting = supporting;
	}
public void display()
{
	System.out.println(id);
	System.out.println(shape);
	System.out.println(height);
	System.out.println(supporting);
}
}
