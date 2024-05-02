package org.org_name.prj_name.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshots 
{
public static void evidence (WebDriver driver, String name) throws IOException
{
TakesScreenshot ts = (TakesScreenshot) driver;	

File f = ts.getScreenshotAs(OutputType.FILE);

File fd = new File("./Screenshot/" + name + ".png");

FileUtils.copyFile(f, fd);
}
}
