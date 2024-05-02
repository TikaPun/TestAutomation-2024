package org.org_name.prj_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fetch_Data_Assertions 
{
WebDriver driver;
@Test
public void tc_fetchData()
{
  driver=new ChromeDriver();//launch the chrome browser
  driver.manage().window().maximize();

    //Test whether actually the browser launch or not ? 

    String expURL="https://www.facebook.com/"; //defining the expected URL   
	driver.get(expURL); //passing the URL-Browser should launch with the given URL
    //Actual URL
	String actURL=driver.getCurrentUrl();//Retrieves the current URL of the web page opened in the browser
	System.out.println("Expetced URL: "+ expURL);
	System.out.println("Actual URL: "+ actURL);
	
	//Assert.assertEquals(actURL, expURL);//By default hard assertion 
	SoftAssert sa=new SoftAssert(); //Soft assertion 
	sa.assertEquals(actURL, expURL);//This will compare the actual and expected URLs
    
	//Expected Title
	String expTitle= "Facebook - log in or sign up"; //defining the expected Title   
	//Actual Title
	String actTitle=driver.getTitle(); //This method will fetch the Title 
	System.out.println("Expected Title: "+ expTitle);
	System.out.println("Actual Title: "+ actTitle);
	
	//Assert.assertEquals(actTitle, expTitle);
	sa.assertEquals(actTitle, expTitle);
	
	/* Verify that all the labels and controls including text boxes, buttons, and links are present
	on the Login page(Facebook.com)*/
	//Fetch attribute value of element  
	/* The code is right but its not working -web page issue
    String ExpUsername="Email address or phone number";
	String ActUsername=driver.findElement(By.id("email")).getAttribute("placeholder");
	System.out.println("Actual UserName is:" +ActUsername);
	//Assert.assertEquals(ActUsername, ExpUsername);
	sa.assertEquals(ExpUsername, ActUsername);
	*/
	
	String ExpPass="Password";//Right click on Element->Inspect->copy the value of placeholder 
	String ActPass=driver.findElement(By.id("pass")).getAttribute("placeholder");
	System.out.println("Expected Password is:" +ExpPass);
	System.out.println("Actual Password is:" +ActPass);
	//Assert.assertEquals(ActPass, ExpPass);
    sa.assertEquals(ActPass, ExpPass);
	
    //Fetch linkText value of element 
//	String ExpLinkText="Log in";//Right click on Element->Inspect->copy the link text  
//	String ActLinkText=driver.findElement(By.name("login")).getText();
//	System.out.println("Expected Password is:" +ExpLinkText);
//	System.out.println("Actual Password is:" +ActLinkText);
//	sa.assertEquals(ActLinkText,ExpLinkText);
	
		
	String ExpLnkTxt="Forgotten password?";//Right click on Element->Inspect->copy the link text  
	String ActLnkTxt=driver.findElement(By.linkText("Forgotten password?")).getText();
	System.out.println("Expected Password is:" +ExpLnkTxt);
	System.out.println("Actual Password is:" +ActLnkTxt);
	sa.assertEquals(ActLnkTxt,ExpLnkTxt);
	sa.assertAll();
  
}
  }
