package com.training.business;

import java.util.List;

public class SalesMan {
	
	int id;
	String name;
	ContactInfo contactInfo;
	List<Sale> sales;
	
	public SalesMan(int id, String name, ContactInfo contactInfo, List<Sale> sales) {
		super();
		this.id = id;
		this.name = name;
		this.contactInfo = contactInfo;
		this.sales = sales;
	}

	public SalesMan() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "SalesMan [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + ", sales=" + sales + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesMan other = (SalesMan) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
