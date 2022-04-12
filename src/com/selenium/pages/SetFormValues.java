package com.selenium.pages;        //Do not change the package name

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

public class SetFormValues {       //Do not change the class name

	public WebDriver driver;
	
    //Constructors are already given. If required, you can add more code into it but do NOT remove the existing code.
    public SetFormValues(){}
    
	public SetFormValues(WebDriver driver) { 
		this.driver= driver;
	}
	public void callAdmission(String department) {
		//locate the admission button and click
		//locate the alert and Provide the course name and accept
		driver.findElement(By.id("admissionButton")).click();
		driver.switchTo().alert().sendKeys(department);
		driver.switchTo().alert().accept();
		
	}
	public void setName(String name) {
        //locate and fill the input box Name
        driver.findElement(By.id("name")).sendKeys(name);
	}
    
    public void setEmail(String email) {
        //locate and fill the input Email
        driver.findElement(By.id("email")).sendKeys(email);
    }

	public void setAge(String age) {
	    //locate and fill the input box Age
	    driver.findElement(By.id("age")).sendKeys(age);
	}	 	  	  		 	     	     	      	 	
	
	public void setGender(String gender) {
	    //locate and click the radio button Gender
	    if(gender.equalsIgnoreCase("Male")){
	       driver.findElement(By.id("male")).click(); 
	    }
	    else if(gender.equalsIgnoreCase("Female")){
	    driver.findElement(By.id("female")).click();

	}
}
	public void setMobileNumber(String mobile) {
        //locate and fill the input box Mobile
        driver.findElement(By.id("mobile")).sendKeys(mobile);
	}

	public void setAbout(String about) {
        //locate and fill the input box About
        driver.findElement(By.id("about")).sendKeys(about);
	}
	
	public void setSchool(String school) {
        //locate and fill the input box School
        driver.findElement(By.id("school")).sendKeys(school);
	}

	public void SubmitForm() {
        //locate the submit button and click
        driver.findElement(By.id("submit")).click();
	}
	
}
