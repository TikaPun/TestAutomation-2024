package org.org_name.prj_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_002_Open_Multiple_Page 
{
	WebDriver driver;//Global (class) variable - any methods can access
	
	@BeforeMethod
		public void launchBrowser()
		
		{
		   //WebDriverManager.chromedriver().setup(); //This is for Selenium 3
			   
			   driver=new ChromeDriver();
			   driver.get("https://www.facebook.com/");
			   driver.manage().window().maximize();
		      
		}
	
	   @AfterMethod
		public void closeBrowsere()

		{
		   driver.close();
		}

	   @Test
	   public void tc_001_login() throws InterruptedException
	   {
	   driver.findElement(By.id("email")).sendKeys("admin@hotmail.com");
	   driver.findElement(By.id("pass")).sendKeys("admin123");
	   Thread.sleep(5000);
	   driver.findElement(By.name("login")).click();
	   Thread.sleep(5000);
	   }
	   @Test
	   public void tc_002_signup() throws InterruptedException
	   {
	   	driver.findElement(By.linkText("Create new account")).click();
	   	Thread.sleep(5000);
	   	driver.findElement(By.name("firstname")).sendKeys("Tika");
	   	driver.findElement(By.name("lastname")).sendKeys("Pun");
	   	//driver.findElement(By.id("[id='u_2_g_4I']")).sendKeys("1234567890"); //css not working
	   	driver.findElement(By.name("reg_email__")).sendKeys("510251454");
	   	Thread.sleep(5000);
	   	driver.findElement(By.id("password_step_input")).sendKeys("signup@123");
	       Thread.sleep(5000);
	       driver.navigate().back();
	       Thread.sleep(5000);
	       driver.navigate().forward();
	       Thread.sleep(5000);
	       driver.navigate().back();
	       Thread.sleep(5000);
	       driver.navigate().refresh();
        
   }
}
