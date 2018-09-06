package com.training.sales.db;

import java.util.List;

import com.training.sales.business.SalesDetail;

public interface SalesDetailsDAO {

	boolean addSales(SalesDetail salesDetails) throws Throwable;
	boolean deleteSales(SalesDetail salesDetails) throws Throwable;
	boolean updateSales(SalesDetail salesDetails) throws Throwable;
	SalesDetail findSales(String salesManName) throws Throwable;
	List<SalesDetail> getAllSalesDetails() throws Throwable;

	
	
}
