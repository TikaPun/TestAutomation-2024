package testNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_And_Enabled_False 
{
//@Test - Marks a class or method as part of test
//@Test(enable=false)- Make test case disable(not to run)	
	@Test(enabled=false) 
	public void testcase2()
{
System.out.println("This is Second Test Case");	
}
@Test(priority=1)
public void testcase3()
{
System.out.println("This is Third Test Case");	
}
@Test(priority=3)
public void testcase4()
{
System.out.println("This is Fourth Test Case");	
}
@Test(priority=2)
public void testcase5()
{
System.out.println("This is Fifth Test Case");	
}
@Test(priority=-1)
public void testcase6()
{
System.out.println("This is Sixth Test Case");	
}
@Test(priority=-2)
public void testcase7()
{
System.out.println("This is Seventh Test Case");	
}

}
