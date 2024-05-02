package org.org_name.prj_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fetch_Element_Is_Selected_Enabled_Displayed 
{
WebDriver driver;
@Test
public void tc_isSelected_isEnabled_isDisplayed() throws InterruptedException
{
  driver=new ChromeDriver();//launch the chrome browser
  driver.manage().window().maximize();
  
//Check if the Radio buttons and Check Boxes are selected or not ?
  //if checked - true otherwise false  
 
 driver.get("https://www.thetestingworld.com/testings/"); //passing the URL
 
Boolean text=driver.findElement(By.xpath("//p[text()='Register now and kick start your career as a Software Testing Pro!']")).isDisplayed();
System.out.println(text);
 //OR we can do below way too
// System.out.println("Text Displayed:" +driver.findElement(By.xpath("//p[text()='Register now and kick start your career as a Software Testing Pro!']")).isDisplayed());
 //OR copying relative xpath as below
 //System.out.println("Text Displayed:" +driver.findElement(By.xpath("//p[@id='\tab-content1\']/p")).isDisplayed()); //Not working ??
 
 
 //Before clicking in home button 
Boolean s= driver.findElement(By.cssSelector("[value='home']")).isSelected(); //Return boolean True or False
 //System.out.println("Before Clicking in Home Radio Button:" +driver.findElement(By.cssSelector("[value='home']")).isSelected());
 //Now click on the home button 
 driver.findElement(By.cssSelector("[value='home']")).click();
 //After clicking in home button
 System.out.println("After Clicking in Home Radio Button:" +driver.findElement(By.cssSelector("[value='home']")).isSelected());
 
 System.out.println("Office Radio Button:" +driver.findElement(By.cssSelector("[value='office']")).isSelected());
 System.out.println("Terms Check Box:" +driver.findElement(By.name("terms")).isSelected());

//Check if the "I agree with terms and conditions" text displayed or not?
 //if checked - true otherwise false  
//System.out.println("Terms text:" +driver.findElement(By.partialLinkText("I agree")).isDisplayed());
//System.out.println("Terms text:" +driver.findElement(By.name("displayPopup")).isDisplayed());
Thread.sleep(5000);
 driver.findElement(By.className("displayPopup")).click();
 Thread.sleep(5000);
 //driver.findElement(By.className("close")).click();
 driver.findElement(By.linkText("X")).click();
//System.out.println("Office Radio Button:" +driver.findElement(By.cssSelector("[value='office']")).isEnabled());
//System.out.println("Terms Check Box:" +driver.findElement(By.name("terms")).isSelected());
//  driver.close();

}
  }
