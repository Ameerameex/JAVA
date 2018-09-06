package com.ameex.training.bean;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Sale> {

	@Override
	public int compare(Sale o1, Sale o2) {
		if(o1.getQuantity()<o2.getQuantity())
			return -1;
		if(o1.getQuantity()>o2.getQuantity())
			return 1;
		return 0;
	}

}
