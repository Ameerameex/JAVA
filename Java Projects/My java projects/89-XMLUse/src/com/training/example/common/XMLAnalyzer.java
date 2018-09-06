package com.training.example.common;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.management.loading.PrivateClassLoader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLAnalyzer {

	private File file;
	private Document document;

	public XMLAnalyzer(String fileName) {
		super();
		this.file = new File(fileName);
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
			try {
				document = builder.parse(file);
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());

		}
	}

	public String getRootElementName() {
		return document.getDocumentElement().getTagName();

	}

	public int getElementCount(String tagName) {

		NodeList list = document.getElementsByTagName(tagName);

		return list.getLength();
	}

	public String getContentOfElement(String tagName, int position) {

		NodeList list = document.getElementsByTagName(tagName);
		Node node = list.item(position);
		Element element = (Element) node;

		return element.getTextContent();

	}
public String getAttributeValueOfElement(String tagName,int position,String attributeName){

	NodeList list = document.getElementsByTagName(tagName);
	Node node = list.item(position);
	Element element = (Element) node;
String value=element.getAttribute(attributeName);
return value;

	
}
public int getCountofAttributesOfElement(String tagName, int position){
	NodeList list = document.getElementsByTagName(tagName);
	Node node = list.item(position);
	Element element = (Element) node;
	NamedNodeMap map=element.getAttributes();
	return map.getLength();
}
public Map<String,String> getAttributeMap(String tagName, int position){
	NodeList list = document.getElementsByTagName(tagName);
	Node node = list.item(position);
	Element element = (Element) node;
	NamedNodeMap map=element.getAttributes();
	Map<String,String> resultMap=new TreeMap<>();
	
	for (int i = 0; i < map.getLength(); i++) {
		
		Node node2=map.item(i);
		Attr attr=(Attr) node2;
		resultMap.put(attr.getName(), attr.getValue());
	
		
	}
	
	return resultMap;
}





}
