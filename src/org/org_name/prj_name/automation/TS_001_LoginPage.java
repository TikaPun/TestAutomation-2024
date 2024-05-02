package org.org_name.prj_name.automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_001_LoginPage 

{
   @Test
	public void loginpage() throws IOException
   {
	   /*WebDriverManager.chromedriver().setup(); //This is for Selenium 3
	  WebDriverManager.firefoxdriver().setup();
	  WebDriverManager.safaridriver().setup();*/
	   
	   WebDriver driver=new ChromeDriver(); 
	   //WebDriver driver=new FirefoxDriver();
	   //WebDriver driver=new SafariDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   CaptureScreenshots.evidence(driver,"LoginPage-Main");
   
       driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
       CaptureScreenshots.evidence(driver,"LoginPage-UserName");
  
       driver.findElement(By.id("pass")).sendKeys("abc@123");
       CaptureScreenshots.evidence(driver,"LoginPage-Password");
       
       driver.findElement(By.name("login")).click();
       CaptureScreenshots.evidence(driver,"LoginPage-Login-Button");
       //driver.findElement(By.linkText("Forgot password?")).click();
       //driver.findElement(By.partialLinkText("Forgot")).click();
       //driver.manage().window().fullscreen();
      
       //driver.manage().window().minimize();
       //driver.close();
        }
}
