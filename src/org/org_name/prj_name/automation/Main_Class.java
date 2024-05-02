package org.org_name.prj_name.automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main_Class 
{
WebDriver driver;

@BeforeMethod
public void First_Method()
{
driver=new ChromeDriver();
driver.navigate().to("https://www.mphasis.com/home.html");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
}
@AfterMethod
public void close_all_wondows()
{
driver.quit();
}
}
