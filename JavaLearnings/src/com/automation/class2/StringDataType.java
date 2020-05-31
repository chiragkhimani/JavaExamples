package com.automation.class2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class StringDataType {
	public static void main(String[] args) throws Exception {
		String firstString = "Hello! ";
		String secondString = "Chirag";

		String mergOfTwoString = firstString + secondString;
		
		int num1 = 10;
		int num2 = 20;

		System.out.println(firstString + num1 + num2);

		System.out.println(num1 + num2 + firstString);

		System.out.println(firstString + (num1 + num2));

		System.out.println(firstString + num1 * num2);

//		System.out.println(firstString * num1 * num2);
		
		
		String xmlFile = "employees.xml";
        
        //Get DOM
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document xml = db.parse(xmlFile);
 
        //Get XPath 
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();
         
        //Get first match
        String name = (String) xpath.evaluate("/employees/employee/firstName", xml, XPathConstants.STRING);
         
        System.out.println(name);   //Lokesh
         
        //Get all matches
        NodeList nodes = (NodeList) xpath.evaluate("/employees/employee/@id", xml, XPathConstants.NODESET);
         
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());   //1 2
        }

	}
}
