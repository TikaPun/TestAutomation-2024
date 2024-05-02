package org.org_name.prj_name.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_Alerts_Frames 
{
WebDriver driver;
@Test (enabled=false)
public void handle_alerts() throws InterruptedException
{
driver=new ChromeDriver();
driver.get("https://www.rediff.com/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.className("signin")).click();
Thread.sleep(5000);
driver.findElement(By.className("signinbtn")).click();
//Alert window displayed here: Alert will block the screen.Nothing we can do until we close alert window and there is no option to inspect.
}
@Test
public void handle_frames() throws InterruptedException
{
driver=new ChromeDriver();
driver.get("https://demoqa.com/frames");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

String Text=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe ')]")).getText();//Printing text to know whether we are getting data or not 
System.out.println(Text);
driver.switchTo().frame("frame1");
//System.out.println(driver.findElement(By.id("sampleHeading")).getText());// The text from Frames won't be printed.So, we need to handle Frames as below    
String Text1= driver.findElement(By.id("sampleHeading")).getText();// The text from Frames won't be printed.So, we need to handle Frames as below    
System.out.println(Text1);
}
}
