package groups_Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups_Demo1 
{
	@Test(groups="Smoke") 
	public void testcase2()
{
System.out.println("This is Second Test Case");	
}
@Test(groups="Sanity")
public void testcase3()
{
System.out.println("This is Third Test Case");	
}
@Test(groups="Regression")
public void testcase4()
{
System.out.println("This is Fourth Test Case");	
}
@Test(groups="Smoke")
public void testcase5()
{
System.out.println("This is Fifth Test Case");	
}
@Test(groups={"Regression", "Sanity"})
public void testcase6()
{
System.out.println("This is Sixth Test Case");	
}
@Test(groups="Sanity")
public void testcase7()
{
System.out.println("This is Seventh Test Case");	
}

}
