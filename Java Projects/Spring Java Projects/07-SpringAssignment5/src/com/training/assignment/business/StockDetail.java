
package com.training.assignment.business;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StockDetail {
	
	Date stockDate;
	double quantity;
	SimpleDateFormat format;
	
	
	
	// Setter Getters
	
	@Override
	public String toString() {
		String str="";
		str=str+ "Stock Date :";
		str=str+format.format(stockDate);
		str=str+ " : " + quantity;
		return str;
	}



	public Date getStockDate() {
		return stockDate;
	}



	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public SimpleDateFormat getFormat() {
		return format;
	}



	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}



	

}
