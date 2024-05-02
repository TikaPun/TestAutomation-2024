package testNG_Scripts;

import org.testng.annotations.Test;

public class DepensOnMethods 
{
//@Test - Marks a class or method as part of test
	@Test (dependsOnMethods="testcase5")
	public void testcase1()
{
System.out.println("This is First Test Case");	
}
@Test
public void testcase2()
{
System.out.println("This is Second Test Case");	
}
@Test
public void testcase3()
{
System.out.println("This is Third Test Case");	
}
@Test
public void testcase4()
{
System.out.println("This is Fourth Test Case");	
}
@Test
public void testcase5()
{
System.out.println("This is Fith Test Case");	
}
@Test
public void testcase6()
{
System.out.println("This is Sixth Test Case");	
}

}
