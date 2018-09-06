package com.ameex.training.business;

import org.omg.CORBA.SetOverrideType;

public class ProductValidationImpl extends ProductImplements {

	@Override
	public void setId(int id) {

		super.setId(id);
		System.out.println("ID set Successfully");
	}

	@Override
	public void setName(String name) {
		if (name.trim().length() == 0)
			return;
		super.setName(name);
		System.out.println("Name set Successfully");

	}

	@Override
	public void setPrice(double price) {
		if (price < 0) {
			return;
		}
		super.setPrice(price);
		System.out.println("Pricee set Successfully");

	}
}
