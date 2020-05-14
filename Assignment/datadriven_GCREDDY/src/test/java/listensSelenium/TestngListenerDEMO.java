package listensSelenium;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listensSelenium.TestngListener.class)
public class TestngListenerDEMO {
@Test//(priority=0)
	public void test1()
	{
		System.out.println("i am inside test1");
	}
@Test//(priority=1)
	public void test2()
	{
		System.out.println("i am inside test2");
	}
@Test//(priority=3)
	public void test3()
	{
		System.out.println("i am inside test3");
		throw new SkipException("this test skipped");
	}
@Test//(priority=4)
	public void test4()
	{
		System.out.println("i am inside test4");
	}
@Test//(priority=5)
	public void test5()
	{
		System.out.println("i am inside test5");
		Assert.assertTrue(false);
	}

}
