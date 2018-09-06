package com.training.example.ui;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main6 {

	public static void main(String[] args) throws Exception {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();

		Document document = builder.parse("Trips.xml");

		Element element = (Element) document.getElementsByTagName("total").item(0);
		String length = element.getTextContent();
		int totalNoOfSeats = Integer.parseInt(length);
		Element element1 = (Element) document.getElementsByTagName("maleCount").item(0);
		String length1 = element1.getTextContent();
		int noOfMaleCounts = Integer.parseInt(length1);

		Element element2 = (Element) document.getElementsByTagName("femaleCount").item(0);
		String length2 = element2.getTextContent();
		int noOfFemaleCounts = Integer.parseInt(length2);

		int noOfTotalPassengers = noOfMaleCounts + noOfFemaleCounts;

		int noOfSeatsLeft = totalNoOfSeats - noOfTotalPassengers;
		System.out.println("Total No Of Seats :" + totalNoOfSeats);
		System.out.println("No Of Male Counts :" + noOfMaleCounts);
		System.out.println("No Of Female Counts :" + noOfFemaleCounts);
		System.out.println("Total Number Of Passengers :" + noOfTotalPassengers);

		System.out.println("No Of Seats Left  :" + noOfSeatsLeft);

	}

}
