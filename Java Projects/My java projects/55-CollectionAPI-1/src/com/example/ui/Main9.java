package com.example.ui;

import java.util.HashSet;
import java.util.Set;

import com.example.business.BusJourney;

public class Main9 {

	public static void main(String[] args) {

		
		BusJourney b1=new BusJourney("Chennai", "Madurai", 12, 500.00);
		BusJourney b2=new BusJourney("Madurai", "Chennai", 12, 500.00);
		BusJourney b3=new BusJourney("Trichy", "Chennai", 8, 350.00);
		BusJourney b4=new BusJourney("Chennai", "Trichy", 8, 350.00);
		BusJourney b5=new BusJourney("Kerala", "telungana", 20, 800.00);
		BusJourney b6=new BusJourney("Kerala", "telungana", 20, 800.00);
System.out.println(b5.equals(b6));
Set<BusJourney> busJourneys=new HashSet<>();

System.out.println(busJourneys.add(b1));
System.out.println(busJourneys.add(b2));
System.out.println(busJourneys.add(b3));
System.out.println(busJourneys.add(b4));
System.out.println(busJourneys.add(b5));
System.out.println(busJourneys.add(b6));
System.out.println(busJourneys.size());
System.out.println(busJourneys);
	}

}
