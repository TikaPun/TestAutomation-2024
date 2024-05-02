package org.org_name.prj_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigate_To_Vs_Get 
{
WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
{
		//WebDriverManager.chromedriver().setup(); //This is for Selenium 3
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
		
	@Test(priority=1)
public void pass_google_URL() throws InterruptedException
{
	//driver.get("https://www.google.com/");//passing the google URL
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("What is Selenium");
	Thread.sleep(5000);
	driver.findElement(By.name("btnK")).click();//css shows 2 matches ??
    driver.navigate().back();
    Thread.sleep(5000);
    driver.navigate().forward();
    Thread.sleep(5000);
    driver.navigate().refresh();
    //driver.close();
    //driver.quit();
    }
@Test (priority=2)
public void pass_facebook_URL() throws InterruptedException
{
driver.get("https://www.facebook.com/");//passing the google URL
//	driver.navigate().to("https://www.facebook.com/");
//	Thread.sleep(5000);
//	driver.navigate().back();
//    Thread.sleep(5000);
//    driver.navigate().forward();
////    Thread.sleep(5000);
//    driver.navigate().refresh();
//driver.close();
}   
    /*	
@Test(priority=2)
	public void pass_facebook_URL() throws InterruptedException
	{
driver.navigate().to("https://www.facebook.com/"); //passing the facebook URL	
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
}*/
}
