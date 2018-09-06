package com.training.business;

import java.util.List;

public class Customer {
	
	int id;
	String name;
	Address address;
	Contact contact;
	String[] nominees;
	List<InterestPayment> payments;
	
	
	public Customer(int id, String name, Address address, Contact contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	public Customer() {
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public String[] getNominees() {
		return nominees;
	}
	public void setNominees(String[] nominees) {
		this.nominees = nominees;
	}
	
	public void addNominees(int count, String ...names) {
		this.nominees=new String[count];
		for(int i=0; i< count ; i++) {
			nominees[i]=names[i];
		}
		
	}
	public List<InterestPayment> getPayments() {
		return payments;
	}
	public void setPayments(List<InterestPayment> payments) {
		this.payments = payments;
	}

	
	

}
