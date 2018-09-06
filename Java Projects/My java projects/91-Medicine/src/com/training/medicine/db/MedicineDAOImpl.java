package com.training.medicine.db;

import java.util.List;

import com.training.example.common.Persistence;
import com.training.example.common.XMLBasedPersistence;
import com.training.medicine.business.Medicine;

public class MedicineDAOImpl implements MedicineDAO {

	@Override
	public boolean addMedicine(Medicine medicine) throws Throwable {
		Persistence<Medicine> persistence=new XMLBasedPersistence<>();
		return persistence.save(medicine);

	}

	@Override
	public boolean deleteMedicine(Medicine medicine) throws Throwable {
		Persistence<Medicine> persistence=new XMLBasedPersistence<>();

		return persistence.delete(medicine);
	}

	@Override
	public boolean updateMedicine(Medicine medicine) throws Throwable {
		Persistence<Medicine> persistence=new XMLBasedPersistence<>();

		return persistence.update(medicine);
	}

	@Override
	public Medicine findMedicine(int id) throws Throwable {
		Persistence<Medicine> persistence=new XMLBasedPersistence<>();

		return persistence.find(Medicine.class, id);
	}

	@Override
	public List<Medicine> getAllMedicines() throws Throwable {
		Persistence<Medicine> persistence=new XMLBasedPersistence<>();

		return persistence.getAll(Medicine.class);
	}

}
