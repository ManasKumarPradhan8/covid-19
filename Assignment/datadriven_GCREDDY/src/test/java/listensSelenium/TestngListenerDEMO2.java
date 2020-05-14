package listensSelenium;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listensSelenium.TestngListener.class)
public class TestngListenerDEMO2 {
@Test//(priority=0)
	public void test6()
	{
		System.out.println("i am inside test6");
	}
@Test//(priority=1)
	public void test7()
	{
		System.out.println("i am inside test7");
	}
@Test//(priority=2)
	public void test8()
	{
		System.out.println("i am inside test8");
		throw new SkipException("this test skipped");
	}
@Test//(priority=3)
	public void test9()
	{
		System.out.println("i am inside test9");
	}
@Test//(priority=4)
	public void test10()
	{
		System.out.println("i am inside test10");
		Assert.assertTrue(false);
	}

}
