package org.org_name.prj_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Eight_Elements_Locator 

{
   @Test
	public void loginpage() throws InterruptedException
   {
	   //WebDriverManager.chromedriver().setup(); //This is for Selenium 3
	   
	   WebDriver driver=new ChromeDriver(); 
	   //driver.get("https://login.yahoo.com/"); //for className
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
       /*
	   //1. id : Pass
	   driver.findElement(By.id("email")).sendKeys("abc@hotmail.com");
       driver.findElement(By.id("pass")).sendKeys("abc123");
       
       //2. name : Pass
       driver.findElement(By.name("login")).click();
       
       //3.className (select static value of 'class') :Pass
	   driver.findElement(By.className("phone-no")).sendKeys("admin@gmail.come");
	   
	  //4. linkText (only for links) : Pass 
       driver.findElement(By.linkText("Forgot password?")).click();
      
      //5. partialLinkText (only for links but not recommended) : Pass
       //enter only partial part (beginning part) of the link text for eg just forgot from "Forgot password"
       driver.findElement(By.partialLinkText("Forgot")).click();
	   driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
	   */
	   
	   //6. xpath
       /*6.1 Relative xpath:
Right Click on desired element on web page->Inspect->Copy->Copy Xpath->Open 'CSS and XPath Checker'->Select XPath->
paste the copied xpath   
For example this is xpath://*[@id="email"]
enter the 'tag' instead of * and make single quote for the value and give double quote for the entire string	   
*/
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@hotmail.com");
driver.findElement(By.xpath("//input[@id=\'pass\']")).sendKeys("abc123");
//Thread.sleep(5000); //add throws declaration
//driver.findElement(By.xpath("//button[@id='u_0_9_qC']")).click(); 
//driver.findElement(By.name("login")).click(); 
 
    
//6.2 Absolute xpath:
//Right Click on desired element on web page->Inspect->Copy->Copy full Xpath->paste the full path putting in double quote  
	   
Thread.sleep(5000);
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
//Thread.sleep(5000);
//driver.close();


	   //7. cssSelector : Use any attribute of the element 
	   //driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin@gmail.com");
	            	   	   
	   //driver.findElement(By.cssSelector("[#name='email']")).sendKeys("admin@gmail.com");
	   //driver.findElement(By.cssSelector("#email")).sendKeys("tika_pun@hotmail.com");
//driver.findElement(By.xpath("#pass")).sendKeys("WeTogether@2022");
//Thread.sleep(5000); //add throws declaration
//-- driver.findElement(By.xpath("//button[@id=\'u_0_9_ze\']")).click();

       //driver.manage().window().fullscreen();
      
       //driver.manage().window().minimize();
       //driver.close();
  
        }
}
