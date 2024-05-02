package testNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Scenario4 
{
@Test //Marks a class or method as part of test
	public void testcase1()
{
System.out.println("This is test Fourth Test Case");	
Assert.assertEquals("hello", "hello");
}
}
