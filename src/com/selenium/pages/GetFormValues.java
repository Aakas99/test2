package com.selenium.pages;
//Aakash

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GetFormValues {
    
	public WebDriver driver;
	public WebElement element;

    //Constructors are already given. If required, you can add more code into it but do NOT remove the existing code.
    public GetFormValues(){}
    
	public GetFormValues(WebDriver driver){
		this.driver= driver;
	}
	
	public String getName() {
        //locate the submitted student in the displayed card and return the text
        
        String str=driver.findElement(By.xpath("//*[@id='description0']/b")).getText();
        return str.substring(7);

	}

	public String getDepartment(){
        //locate the submitted department in the displayed card and return the text
       String str=driver.findElement(By.xpath("//*[@id='description0']/label[1]")).getText();
       return str.substring(13);
	}
	
	
	public String getEmail() {
        //locate the submitted email in the displayed card and return the text
       String str=driver.findElement(By.xpath("//*[@id='description0']/label[2]")).getText();
       return str.substring(7);

	}

	public String getAge() {
        //locate the submitted age in the displayed card and return the text
        String str=driver.findElement(By.xpath("//*[@id='description0']/label[3]")).getText();
        return str.substring(5);

	}	 	  	  		 	     	     	      	 	

	public String getGender() {
        //locate the submitted gender in the displayed card and return the text
        String str=driver.findElement(By.xpath("//*[@id='description0']/label[4]")).getText();
        return str.substring(8);
	}
	
	public String getMobile(){
        //locate the submitted mobile number in the displayed card and return the text
       String str=driver.findElement(By.xpath("//*[@id='description0']/label[5]")).getText();
       return str.substring(9);

	}
	
	public String getAbout(){
        //locate the submitted about in the displayed card and return the text
        String str=driver.findElement(By.xpath("//*[@id='description0']/label[6]")).getText();
        return str.substring(7);

	}
	
	public String getSchool(){
        //locate the submitted school in the displayed card and return the text
       String str=driver.findElement(By.xpath("//*[@id='description0']/label[7]")).getText();
       return str.substring(8);

	}
	public String getErrorMessage(){
        //locate the error message and return the text
    return driver.findElement(By.id("errormessage")).getText();
        
	}
	
}
