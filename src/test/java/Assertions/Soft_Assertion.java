package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	SoftAssert sa= new SoftAssert();
	@Test
	public void test1()
	{
		int a=20;
		int b=20;
	sa.assertEquals(a,b);
	
    sa.assertNotEquals(a,b);
   
	}
	@Test
	public void test2()
	{
		int num1=20;
		int num2=30;
		sa.assertEquals(num1,num2);
		sa.assertTrue(num1>num2);
	
	}
	@Test
	public void test3()
	{
		int a=20;
		int b=20;
	sa.assertEquals(a,b);
	
	sa.assertTrue(2>1);
	
	}

}
