package projects.naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriLogin {
	 static WebDriver driver;
	@BeforeTest
	public static void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

@Test
public void login()
{
	
	driver.get("https://www.naukri.com/");
	SoftAssert sf=new SoftAssert();
	sf.assertEquals("abcd",driver.getTitle());
	driver.findElement(By.linkText("LOGIN")).click();
WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("userid");
driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("pass123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
