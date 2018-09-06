package com.example.ui;

import java.util.Set;
import java.util.TreeSet;

import com.example.business.BusJourney;
import com.example.business.PriceAscendingComparator;
import com.example.business.PriceComparator;

public class Main1 {

	public static void main(String[] args) {
		

		BusJourney b1=new BusJourney("Chennai", "Madurai", 12, 500.00);
		BusJourney b2=new BusJourney("Madurai", "Chennai", 12, 500.00);
		BusJourney b3=new BusJourney("Trichy", "Chennai", 8, 350.00);
		BusJourney b4=new BusJourney("Chennai", "Trichy", 8, 350.00);
		BusJourney b5=new BusJourney("Kerala", "telungana", 20, 800.00);
		BusJourney b6=new BusJourney("Kerala", "telungana", 20, 800.00);
		
		PriceComparator comparator=new PriceComparator();
		PriceAscendingComparator ascendingComparator=new PriceAscendingComparator();
		Set<BusJourney> busJourneys=new TreeSet<>(ascendingComparator);
		
		
		busJourneys.add(b1);
		busJourneys.add(b2);
		busJourneys.add(b3);
		busJourneys.add(b4);
		busJourneys.add(b5);
		busJourneys.add(b6);
		
		System.out.println(busJourneys);

		

	}

}
