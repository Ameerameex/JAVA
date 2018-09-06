package com.training.sales.db;

import java.util.List;

import com.training.example.common.Persistence;
import com.training.example.common.XMLBasedPersistence;
import com.training.sales.business.SalesDetail;

public class SalesDetailsDAOImpl implements SalesDetailsDAO {

	@Override
	public boolean addSales(SalesDetail salesDetails) throws Throwable {
Persistence<SalesDetail> persistence=new XMLBasedPersistence<>();

		
		return persistence.save(salesDetails);
	}

	@Override
	public boolean deleteSales(SalesDetail salesDetails) throws Throwable {
		Persistence<SalesDetail> persistence=new XMLBasedPersistence<>();

		
		return persistence.delete(salesDetails);
	}

	@Override
	public boolean updateSales(SalesDetail salesDetails) throws Throwable {
		Persistence<SalesDetail> persistence=new XMLBasedPersistence<>();

		
		return persistence.update(salesDetails);
	}

	@Override
	public SalesDetail findSales(String salesManName) throws Throwable {
		Persistence<SalesDetail> persistence=new XMLBasedPersistence<>();

		return persistence.find(SalesDetail.class, salesManName);
	}

	@Override
	public List<SalesDetail> getAllSalesDetails() throws Throwable {
		Persistence<SalesDetail> persistence=new XMLBasedPersistence<>();

		return persistence.getAll(SalesDetail.class);
	}

}
