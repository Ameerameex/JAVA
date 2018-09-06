package com.training.example.ui;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.training.example.business.Driver;
import com.training.example.business.Trip;

public class Main9{

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, DOMException, ParseException {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse("Trips.xml");
		Element element = (Element) document.getElementsByTagName("trip").item(0);

		

		Element element1 = (Element) element.getElementsByTagName("from").item(0);
		Element element2 = (Element) element.getElementsByTagName("to").item(0);
		
		Element element4 = (Element) element.getElementsByTagName("fare").item(0);
		Element element5 = (Element) element.getElementsByTagName("fare").item(1);
		Element element6 = (Element) element.getElementsByTagName("date").item(0);
		Element element7 = (Element) element.getElementsByTagName("total").item(0);
		Element element8 = (Element) element.getElementsByTagName("maleCount").item(0);
		Element element9 = (Element) element.getElementsByTagName("femaleCount").item(0);

		Trip trip1 = new Trip();

		trip1.setId(element.getAttribute("id"));
		trip1.setOperatorName(element.getAttribute("operator"));

		trip1.setSource(element1.getTextContent());
		trip1.setDestination(element2.getTextContent());
		trip1.setAdultFare(Double.parseDouble(element4.getTextContent()));
		trip1.setKidFare(Double.parseDouble(element5.getTextContent()));

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		trip1.setTripDate(dateFormat.parse(element6.getTextContent()));
		trip1.setTotalSeats(Integer.parseInt(element7.getTextContent()));
		int occupiedSeats = (Integer.parseInt(element8.getTextContent())) + Integer.parseInt(element9.getTextContent());

		trip1.setOccupiedSeats(occupiedSeats);
		
		Driver driver = new Driver();

		Element element10 = (Element) element.getElementsByTagName("driver").item(0);

		Element element11 = (Element) element10.getElementsByTagName("name").item(0);
		Element element12 = (Element) element10.getElementsByTagName("age").item(0);
		driver.setName(element11.getTextContent());
		driver.setAge(Integer.parseInt(element12.getTextContent()));

		List<Object> trips = new ArrayList<>();
		trips.add(trip1);
		trips.add(driver);
		
	
		
	
		

		
		
Element element13 = (Element) document.getElementsByTagName("trip").item(1);

		

		Element element14 = (Element) element13.getElementsByTagName("from").item(0);
		Element element15 = (Element) element13.getElementsByTagName("to").item(0);
		
		Element element16 = (Element) element13.getElementsByTagName("fare").item(0);
		Element element17 = (Element) element13.getElementsByTagName("fare").item(1);
		Element element18 = (Element) element13.getElementsByTagName("date").item(0);
		Element element19 = (Element) element13.getElementsByTagName("total").item(0);
		Element element20= (Element) element13.getElementsByTagName("maleCount").item(0);
		Element element21= (Element) element13.getElementsByTagName("femaleCount").item(0);
		

		Trip trip2 = new Trip();

		trip2.setId(element13.getAttribute("id"));
		trip2.setOperatorName(element13.getAttribute("operator"));

		trip2.setSource(element14.getTextContent());
		trip2.setDestination(element15.getTextContent());
		trip2.setAdultFare(Double.parseDouble(element16.getTextContent()));
		trip2.setKidFare(Double.parseDouble(element17.getTextContent()));

		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		trip2.setTripDate(dateFormat1.parse(element18.getTextContent()));
		trip2.setTotalSeats(Integer.parseInt(element19.getTextContent()));
		int occupiedSeats1 = (Integer.parseInt(element20.getTextContent())) + Integer.parseInt(element21.getTextContent());

		trip2.setOccupiedSeats(occupiedSeats1);
		Driver driver1 = new Driver();

		Element element22 = (Element) element13.getElementsByTagName("driver").item(0);

		Element element23 = (Element) element22.getElementsByTagName("name").item(0);
		Element element24 = (Element) element22.getElementsByTagName("age").item(0);
		driver1.setName(element23.getTextContent());
		driver1.setAge(Integer.parseInt(element24.getTextContent()));

		trips.add(trip2);
		trips.add(driver1);
		System.out.println(trips);
		
		
	}

}
