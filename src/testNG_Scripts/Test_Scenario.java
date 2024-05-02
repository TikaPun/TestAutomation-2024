package testNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Scenario 
{
@Test //Marks a class or method as part of test
	public void testcase1()
{
System.out.println("This is First Test Case");	
Assert.assertEquals("Good Morning", "Good Morning");
}
}
