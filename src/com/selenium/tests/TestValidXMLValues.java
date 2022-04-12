package com.selenium.tests;   //Do not change the package name

import static org.testng.Assert.assertEquals;
import java.lang.reflect.Method;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import org.testng.annotations.Listeners;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import com.selenium.pages.GetFormValues;
import com.selenium.pages.SetFormValues; 
import com.selenium.setup.DriverSetup;
import com.selenium.setup.XMLUtils;


@Listeners(FeatureTest.class)  //Do not change or remove this line.
public class TestValidXMLValues extends DriverSetup { //Do not change the class name

    // Do not change the variable name given below
	static WebDriver driver;
	static SetFormValues setformValues;
	static GetFormValues getformValues;

    public static String successtxt;
	public static String Nametxt;
	public static String Emailtxt;
	public static String Agetxt;
	public static String Gendertxt;
	public static String Mobiletxt;
	public static String Abouttxt;
	public static String Schooltxt;
	public static String Departmenttxt;
	
	public static String[] xmlValidData = null;
	String baseUrl = "https://webapps.tekstac.com/College/";
		
	@BeforeClass//Apply the required annotation	
	public void setUp() {   // Do not change the method signature
		 	  	  		 	     	     	      	 	
		//create the driver using method 'getDriver' in class DriverSetup.
		//Assign it to the variable 'driver'
      driver=DriverSetup.getDriver();
      driver.get(baseUrl);
      
      
        //Navigate to baseUrl
      
      
		//DO NO CHANGE THE BELOW 2 OBJECT CREATIONS
		setformValues= new SetFormValues(driver);
		getformValues= new GetFormValues(driver);
	}
	
	public static String[] getXMLData() throws Exception { // Do not change the method signature
	        
	    //Call the method 'readFile' in class 'XMLUtils' using the xml file name 'StudentValid.xml'
		//Assign it to the variable 'xmlValidData' to store the XML data retrieved.
		//Return the array.
		xmlValidData=XMLUtils.readFile("StudentValid.xml");
		return xmlValidData;
		
	}
	
    @Test//Apply the required annotation 
	public void testValidXMLDetails() throws Exception {	// Do not change the method signature
	xmlValidData=getXMLData();
	setformValues.callAdmission("CSE");
	setformValues.setName(xmlValidData[0]);
	setformValues.setEmail(xmlValidData[1]);
	setformValues.setAge(xmlValidData[2]);
	setformValues.setGender(xmlValidData[3]);
	setformValues.setMobileNumber(xmlValidData[4]);
	setformValues.setAbout(xmlValidData[5]);
	setformValues.setSchool(xmlValidData[6]);
	setformValues.SubmitForm();
	
	
		//Call the method getXMLData( ) to read the XML data. 		
		//Use 'setformValues' object and call the method callAdmission() and pass the string value as parameter. 
		//Use 'setformValues' object and call the method setName() and pass the string array value xmlValidData[0] as parameter. 
		//Use 'setformValues' object and call the method setEmail() and pass the string array value xmlValidData[1] as parameter. 
		//Use 'setformValues' object and call the method setAge() and pass the string array value xmlValidData[2] as parameter. 
		//Use 'setformValues' object and call the method setGender() and pass the string array value xmlValidData[3] as parameter.
		//Use 'setformValues' object and call the method setMobileNumber() and pass the string array value xmlValidData[4] as parameter.
		//Use 'setformValues' object and call the method setAbout() and pass the string array value xmlValidData[5] as parameter.
		//Use 'setformValues' object and call the method setSchool() and pass the string array value xmlValidData[6] as parameter.

		//Use 'setformValues' object and call the method SubmitForm() to click the 'Submit' button. 
		
		
		
		//After clicking the button, it will display the information of that student
		Nametxt=getformValues.getName();
		Emailtxt=getformValues.getEmail();
		Agetxt=getformValues.getAge();
		Gendertxt=getformValues.getGender();
		Mobiletxt=getformValues.getMobile();
		Abouttxt=getformValues.getAbout();
		Schooltxt=getformValues.getSchool();
		Departmenttxt=getformValues.getDepartment();
	String	Errortxt=getformValues.getErrorMessage();
		
		//Use 'getformValues' object and call the method getName() and store the displayed message in a static variable 'Nametxt'.		
		//Use 'getformValues' oject and call the method getEmail() and store the displayed message in a static variable 'Emailtxt'. 	
	    //Use 'getformValues' object and call the method getAge() and store the displayed message in a static variable 'Agetxt'.
	    //Use 'getformValues' object and call the method getGender() and store the displayed message in a static variable 'Gendertxt'.
	    //Use 'getformValues' object and call the method getMobile() and store the displayed message in a static variable 'Mobiletxt'.		
		//Use 'getformValues' object and call the method getAbout() and store the displayed message in a static variable 'Abouttxt'. 	
	    //Use 'getformValues' object and call the method getSchool() and store the displayed message in a static variable 'Schooltxt'.
	    //Use 'getformValues' object and call the method getDepartment() and store the displayed message in a static variable 'Departmenttxt'.
	    //Use 'getformValues' object and call the method getErrorMessage() 

	    
	    
		//Assert whether the 'Nametxt' contains the array value in '0'
         Assert.assertEquals(Nametxt,xmlValidData[0]);
         
		//Assert whether the 'Emailtxt' contains the array value in '1'
		Assert.assertEquals(Emailtxt,xmlValidData[1]);
		//Assert whether the 'Agetxt' contains the array value in '2'
	     Assert.assertEquals(Agetxt,xmlValidData[2]);
		//Assert whether the 'Gendertxt' contains the array value in '3'
		Assert.assertEquals(Gendertxt,xmlValidData[3]);
		//Assert whether the 'Mobiletxt' contains the array value in '4'
        Assert.assertEquals(Mobiletxt,xmlValidData[4]);
		//Assert whether the 'Abouttxt' contains the array value in '5'
        Assert.assertEquals(Abouttxt,xmlValidData[5]);
		//Assert whether the 'Schooltxt' contains the array value in '6'
		Assert.assertEquals(Schooltxt,xmlValidData[6]);
	}
	
   @AfterClass	//Apply the required annotation
	public void closeBrowser() {  // Do not change the method signature
		//close the driver
		driver.close();
	}
	
}
