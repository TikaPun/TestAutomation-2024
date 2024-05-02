package org.org_name.prj_name.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKeyboard 
{
WebDriver driver;
@Test (enabled=false)//This will skip this method to execute
public void managekeyboard() throws InterruptedException

{
	driver=new ChromeDriver(); //Launch empty Chrome Browser
	//driver.get("https://www.facebook.com/"); //Pass the URL
	driver.get("https://www.thetestingworld.com/testings/");
	//driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	
	//There is "Actions" Class to handle keyboard and mouse
	Actions act=new Actions(driver); //Adding argument to match Actions(WebDriver) 
	
	//act.sendKeys("tika_pun@hotmail.com").perform();//Action is lazy class, so we need method perform
    //act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).perform();//No case sensitive
    //We can clear normally without 'Actions' class as below  
    //driver.findElement(By.id("email")).clear();
    /*
    act.sendKeys(Keys.TAB).perform(); //Tab- Moving to next element
    act.sendKeys("WeTogether@2022").perform(); //Pass value in the password text box
    act.sendKeys(Keys.ENTER).perform(); //Hit Enter on the Enter Keyboard 
    //Or we can move to next 'Log in' button and Hit Enter  
    act.sendKeys(Keys.TAB).perform(); 
    act.sendKeys(Keys.ENTER).perform(); //Hit Enter on the Enter Keyboard 
	*/
    //Page scrolling Down and Up 
    
    act.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(5000);
    act.sendKeys(Keys.PAGE_UP).perform();
    }
@Test
public void managemouse() throws InterruptedException

{
	driver=new ChromeDriver(); //Launch empty Chrome Browser
	//driver.get("https://www.mphasis.com/home.html/"); //Pass the URL
	driver.navigate().to("https://www.mphasis.com/home.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    
	Actions act1=new Actions(driver);
	/*
	act1.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();//Left click on mouse
	//Relative xPath: 'a' input and 'Our Approach' LinkText(innertext) 
	Thread.sleep(3000);	
	act1.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform(); //Double left click on mouse  
	act1.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform(); //Right click on mouse 
	Thread.sleep(3000);
	//Move mouse from one element to another
	*/
	act1.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
	Thread.sleep(3000);
	//act1.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();//link text has some space
	//The same "Hospitality" element opening in the new window (Pressing on CTRL/CMD key in the keyboard)
	act1.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.COMMAND).perform();//link text has some space
	Thread.sleep(3000);
	driver.close();
}
}
