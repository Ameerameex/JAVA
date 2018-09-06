package com.training.medicine.db;


import java.util.List;

import com.training.medicine.business.Medicine;


public interface MedicineDAO {

	boolean addMedicine(Medicine medicine) throws Throwable;
	boolean deleteMedicine(Medicine medicine) throws Throwable;
	boolean updateMedicine(Medicine medicine) throws Throwable;
	Medicine findMedicine(int id) throws Throwable;
	List<Medicine> getAllMedicines() throws Throwable;

	
}
