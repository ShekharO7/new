package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
	@Test
	public void test1()
	{
		int a=20;
		int b=50;
	Assert.assertEquals(a,b);
	Assert.assertNotEquals(a,b);
	
	}
	@Test
	public void test2()
	{
		int a=20;
		int b=20;
	Assert.assertEquals(a,b);
	
	Assert.assertNotEquals(a,b);
	
	}
	@Test
	public void test3()
	{
		int a=20;
		int b=20;
	Assert.assertEquals(a,b);
	
	Assert.assertTrue(a!=b);
	}
	
}
