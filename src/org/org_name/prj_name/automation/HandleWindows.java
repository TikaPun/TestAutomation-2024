package org.org_name.prj_name.automation;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleWindows extends Main_Class
{
//WebDriver driver;
	@Test
	public void tc_001_manage_windowhandles() throws InterruptedException, IOException

	{
		/*driver=new ChromeDriver();
		driver.navigate().to("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		*/
		
		Actions act1=new Actions(driver);
		
		act1.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();//Left click on mouse
		//Move mouse from one element to another
		//CaptureScreenshots.evidence(driver,"tc_001_Our Approach Page"); 
		
		act1.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		Thread.sleep(3000);
		//act1.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();//link text has some space
		//The same "Hospitality" element opening in the new window (Pressing on CTRL/CMD key in the keyboard)
		
		act1.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.COMMAND).perform();//link text has some space
		//CaptureScreenshots.evidence(driver,"tc_001_Hospitality Page");
		Thread.sleep(3000);
		act1.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//span[contains(text(),' Hi-Tech ')]"))).keyUp(Keys.COMMAND).perform();//link text has some space
		//CaptureScreenshots.evidence(driver,"tc_001_Hi-Tech Page");
		Thread.sleep(3000);
		act1.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//span[contains(text(),' Travel and Transportation')]"))).keyUp(Keys.COMMAND).perform();
		//CaptureScreenshots.evidence(driver,"tc_001_Travel and Transpostation");
		Set<String> winsid=driver.getWindowHandles();
	    System.out.println(winsid);
		
		
	    java.util.Iterator<String> itr = winsid.iterator(); 
		String win1=itr.next(); //Industries
		String win2=itr.next(); //Hospitality
		String win3=itr.next(); //Hi-Tech
		String win4=itr.next(); //Travel and Transportation
		
		//Thread.sleep(5000);
    	//driver.switchTo().window(win2);
		//Thread.sleep(3000);
    	//driver.switchTo().window(win3);
    	//Thread.sleep(3000);
    	//driver.switchTo().window(win4);
    	//driver.close();
	
	}
}
