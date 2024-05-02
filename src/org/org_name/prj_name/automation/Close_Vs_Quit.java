package org.org_name.prj_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Close_Vs_Quit 
{
WebDriver driver;
    @Test
	public void tc_close_quit() throws InterruptedException
{
	driver=new ChromeDriver(); //launch empty chrome browser
	driver.manage().window().maximize();
	driver.get("https://www.thetestingworld.com/testings/"); //passing the URL
	//driver.navigate().to("https://www.thetestingworld.com/testings/");/passing the URL
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("[src='banner/64625f639e847.png']")).click();//Open another window
	Thread.sleep(5000);
	driver.close();//Close one window at a time 
	//driver.quit();

}

}
