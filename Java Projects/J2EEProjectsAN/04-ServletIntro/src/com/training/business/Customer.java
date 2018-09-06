package com.training.business;

import java.util.List;

public class Customer {

	int id;
	String name;
	Contact contact;
	Bank bank;
	char gender;
	boolean sendSMSAlerts;
	List<Account> accounts;
	public Customer(int id, String name, Contact contact, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.bank = bank;
	}
	
	public Customer(int id, String name, Contact contact, Bank bank, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.bank = bank;
		this.gender = gender;
	}
	

	public Customer(int id, String name, Contact contact, Bank bank, char gender, boolean sendSMSAlerts) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.bank = bank;
		this.gender = gender;
		this.sendSMSAlerts = sendSMSAlerts;
	}

	public boolean isSendSMSAlerts() {
		return sendSMSAlerts;
	}

	public void setSendSMSAlerts(boolean sendSMSAlerts) {
		this.sendSMSAlerts = sendSMSAlerts;
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
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
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
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contact=" + contact + ", bank=" + bank + ", gender="
				+ gender + ", sendSMSAlerts=" + sendSMSAlerts + ", accounts=" + accounts + "]";
	}
	
	
}
