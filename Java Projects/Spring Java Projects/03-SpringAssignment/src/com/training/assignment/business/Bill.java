package com.training.assignment.business;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Bill  {
	
	int billNo;
	Date billDate;
	int[] serialNumbers;
	String[] itemNames;
	double[] prices;
	int[] quantitys;
	
	
	// Setter - Getter methods
	
	// toString() method
	
	
	public double getTotalBillValue() {
		double total=0.0;
		for(int i=0; i<serialNumbers.length; i++) {
			total=total+(prices[i]*quantitys[i]);
		}
		return total;
	}
	
	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public int[] getSerialNumbers() {
		return serialNumbers;
	}

	public void setSerialNumbers(int[] serialNumbers) {
		this.serialNumbers = serialNumbers;
	}

	public String[] getItemNames() {
		return itemNames;
	}

	public void setItemNames(String[] itemNames) {
		this.itemNames = itemNames;
	}

	public double[] getPrices() {
		return prices;
	}

	public void setPrices(double[] prices) {
		this.prices = prices;
	}

	public int[] getQuantitys() {
		return quantitys;
	}

	public void setQuantitys(int[] quantitys) {
		this.quantitys = quantitys;
	}

	public double getTotalItemCount() {
		return serialNumbers.length;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		String date=dateFormat.format(billDate);
		
		return "Bill [billNo=" + billNo + ", billDate=" + date + ", serialNumbers=" + Arrays.toString(serialNumbers)
				+ ", itemNames=" + Arrays.toString(itemNames) + ", prices=" + Arrays.toString(prices) + ", quantitys="
				+ Arrays.toString(quantitys) + ", getTotalBillValue()=" + getTotalBillValue() + ", getTotalItemCount()="
				+ getTotalItemCount() + "]";
	}

	

	
}
