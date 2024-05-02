package org.org_name.prj_name.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadioButton_CheckBox 
{
    @Test
	public void tc_rdbtn_ckbx() throws InterruptedException
{
WebDriver driver=new ChromeDriver(); //launch empty chrome browser
driver.get("https://www.thetestingworld.com/testings/"); //passing the URL
//driver.navigate().to("https://www.thetestingworld.com/testings/"); //passing the URL
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//driver.findElement(By.linkText("Register")).click(); // There are two register so linkText not working 
//driver.findElement(By.cssSelector("li:nth-child(1) > label")).click();
driver.findElement(By.name("fld_username")).sendKeys("Tika");
driver.findElement(By.name("fld_email")).sendKeys("abc@gmail.com");
driver.findElement(By.name("fld_password")).sendKeys("abc123");
driver.findElement(By.name("fld_cpassword")).sendKeys("abc123");


//driver.findElement(By.id("datepicker")).sendKeys("06/10/1985");

driver.findElement(By.name("phone")).sendKeys("123 456 1234");
driver.findElement(By.name("address")).sendKeys("123 Test Street, Oakland, CA-12345");
Thread.sleep(3000); //Just to pause 3 seconds 
//Radio Button 
//driver.findElement(By.name("add_type")).click(); //for Home
driver.findElement(By.cssSelector("input:nth-child(17)")).click(); //for Office (value=office)

Select gen=new Select(driver.findElement(By.name("sex"))); //Selecting from dropdown
gen.selectByVisibleText("Male");

Select cnty=new Select(driver.findElement(By.id("countryId")));
cnty.selectByVisibleText("Argentina");

//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Salta"));//Chaco or any state can be selected here
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stateId")));
//Thread.sleep(5000); Implicit wait time has applied 
Select state=new Select(driver.findElement(By.id("stateId")));
state.selectByVisibleText("Chaco"); 
//Thread.sleep(5000);Implicit wait time has applied

wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Resistencia"));

Select city=new Select(driver.findElement(By.id("cityId")));
city.selectByVisibleText("Resistencia");
driver.findElement(By.name("zip")).sendKeys("12345");
driver.findElement(By.name("terms")).click(); //Check Box
//driver.close();
}
}
