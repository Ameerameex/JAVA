package com.training.example.ui;

import java.util.Map;

import com.training.example.common.XMLAnalyzer;

public class Main7 {

	public static void main(String[] args) {

		XMLAnalyzer analyzer = new XMLAnalyzer("Trips.xml");

		System.out.println(analyzer.getElementCount("trip"));
		System.out.println(analyzer.getElementCount("driver"));

		System.out.println(analyzer.getContentOfElement("from", 0));
		System.out.println(analyzer.getContentOfElement("to", 0));

		System.out.println(analyzer.getCountofAttributesOfElement("trip", 0));

		System.out.println(analyzer.getCountofAttributesOfElement("fare", 0));
		System.out.println(analyzer.getCountofAttributesOfElement("seats", 0));

		System.out.println(analyzer.getAttributeValueOfElement("trip", 0, "id"));
		System.out.println(analyzer.getAttributeValueOfElement("trip", 1, "operator"));
		System.out.println(analyzer.getAttributeValueOfElement("fare", 0, "type"));
		System.out.println(analyzer.getAttributeMap("fare", 0));

		Map<String, String> map = analyzer.getAttributeMap("trip", 0);

		System.out.println(map);

	}

}
