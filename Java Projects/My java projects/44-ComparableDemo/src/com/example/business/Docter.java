package com.example.business;

public class Docter implements Comparable {

	private String Name;
	private double Fees;
	private int experience;

	public Docter(String name, double fees, int experience) {
		super();
		Name = name;
		Fees = fees;
		this.experience = experience;
	}

	@Override
	public int compareTo(Object o) {
		Docter temp = (Docter) o;
		int r = this.Name.compareTo(temp.Name);

		return r;

	}

}
