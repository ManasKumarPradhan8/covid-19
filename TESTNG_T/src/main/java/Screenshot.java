import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class Screenshot extends Base {
	
@BeforeMethod
public void setup()
{
	initialisation();
}
@AfterMethod
public void teardown()
{
	driver.quit();
}
@Test
public void takesscreenshot()
{
Assert.assertEquals(15,20);
}
}
