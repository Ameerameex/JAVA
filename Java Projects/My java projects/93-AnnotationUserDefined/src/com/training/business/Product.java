package com.training.business;

import java.lang.annotation.Target;
import java.util.Date;

import com.training.Annotations.Column;
import com.training.Annotations.Key;
import com.training.Annotations.MyName;
import com.training.Annotations.Programmer;
import com.training.Annotations.Table;
@Table(dbName = "salesDB", name = "Product")
public class Product {
    @Column(colType = "int", name = "id", width =5) 
    @Key
	int id;
    @Column(colType = "varchar", name = "name", width =25)
	String name;
    @Column(colType = "date", name = "mdate", width =20)
	Date manufacturedDate;
    @Column(colType = "double", name = "price", width =11,precisionWidth=2)
	double price;
    @Column(colType = "char", name = "category", width =1)
	char category;
    
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final Date getManufacturedDate() {
		return manufacturedDate;
	}
	public final void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	public final char getCategory() {
		return category;
	}
	public final void setCategory(char category) {
		this.category = category;
	}
	public Product(int id, String name, Date manufacturedDate, double price, char category) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturedDate = manufacturedDate;
		this.price = price;
		this.category = category;
	}
	public Product() {
		super();
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
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturedDate=" + manufacturedDate + ", price=" + price
				+ ", category=" + category + "]";
	}
	@MyName("Ameer")
	void test(){
		
	}
	@Programmer(true)
	void test1(){
		
	}
}
