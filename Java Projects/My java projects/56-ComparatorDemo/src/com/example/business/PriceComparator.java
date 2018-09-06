package com.example.business;

import java.util.Comparator;

public class PriceComparator implements Comparator<BusJourney> {

	@Override
	public int compare(BusJourney o1, BusJourney o2) {
		if(o1.getFare()<o2.getFare())
		return 1;
		if(o1.getFare()>o2.getFare())
			return -1;
		
			return 0;
	}

}
