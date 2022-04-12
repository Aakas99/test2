package com.selenium.setup;        //Do not change the package name

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.xpath.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public class XMLUtils {      //Do not change the class name

    // Use the below declared variables
	public static Document doc;
	public static String[] xmlData = new String[7];

	public static String[] readFile(String fileName) throws Exception { // Do not change the method signature
	
		//Get the XML file path 
		//Using the file name passed to this method, parse the XML file, read the XML data and store it in a string array.
		//Return the array. 
		File xmlFile=new File("College/src/"+fileName);
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		doc=db.parse(xmlFile);
		doc.getDocumentElement().normalize();
		XPathFactory xfac=XPathFactory.newInstance();
		XPath xp=xfac.newXPath();
		Node node=null;
		try {
		    node=(Node) xp.compile("//Student/Name").evaluate(doc,XPathConstants.NODE);
		    xmlData[0]=node.getTextContent();
		    
		    node=(Node) xp.compile("//Student/Email").evaluate(doc,XPathConstants.NODE);
		    xmlData[1]=node.getTextContent();
		     
		    node=(Node) xp.compile("//Student/Age").evaluate(doc,XPathConstants.NODE);
		    xmlData[2]=node.getTextContent();
		     
		     node=(Node) xp.compile("//Student/Gender").evaluate(doc,XPathConstants.NODE);
		     xmlData[3]=node.getTextContent();
		     
		     node=(Node) xp.compile("//Student/Mobile").evaluate(doc,XPathConstants.NODE);
		     xmlData[4]=node.getTextContent();
		     
		     node=(Node) xp.compile("//Student/About").evaluate(doc,XPathConstants.NODE);
		     xmlData[5]=node.getTextContent();
		     
		     node=(Node) xp.compile("//Student/School").evaluate(doc,XPathConstants.NODE);
		     xmlData[6]=node.getTextContent();
		} catch(Exception e){
		    
		}
		
		//For example, store XML values in the string array. 
		  //xmlData[0]  // 'Name' read from xml file
		  //xmlData[1]  // 'Email' read from xml file
		  //xmlData[2]  // 'Age' read from xml file
		  //xmlData[3]  // 'Gender' read from xml file
		  //xmlData[4]  // 'Mobile' read from xml file
		  //xmlData[5]  // 'About' read from xml file
		  //xmlData[6]  // 'School' read from xml file
	   
	return xmlData;
}
}
   