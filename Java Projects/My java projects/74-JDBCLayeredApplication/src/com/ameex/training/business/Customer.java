package com.ameex.training.business;

public class Customer extends Address{

	int id;
	String name;
	char gender;
	int age;
	String proofId;
	Address address;
	ContactInfo contactInfo;
	boolean bookingDone;
	public Customer(String name, char gender, int age, String proofId, Address address, ContactInfo contactInfo,
			boolean bookingDone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.proofId = proofId;
		this.address = address;
		this.contactInfo = contactInfo;
		this.bookingDone = bookingDone;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public boolean isBookingDone() {
		return bookingDone;
	}
	public void setBookingDone(boolean bookingDone) {
		this.bookingDone = bookingDone;
	}
	@Override
	public String toString() {
		return "Customer [getId()=" + getId() + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ ", getAge()=" + getAge() + ", getProofId()=" + getProofId() + ", getAddress()=" + getAddress()
				+ ", getContactInfo()=" + getContactInfo() + ", isBookingDone()=" + isBookingDone() + "]";
	}
	
	
}
