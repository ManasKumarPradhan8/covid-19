package Selenium_table_vanu;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1_bhanu4b {// FETHCHING THE BIGGEST FROM THE TABLE//RUNNING
							// SUCCESSFULLY
	static WebDriver driver;

	@Test
	public static void GETDATA() throws ParseException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String row="//*[@id='leftcontainer']/table/tbody/tr";
		int rowcount = driver.findElements(By.xpath(row)).size();
System.out.println(rowcount);

String col="//*[@id='leftcontainer']/table/tbody/tr[1]/td[]";
int colcount=driver.findElements(By.xpath(col)).size();
System.out.println(colcount);

String first="//*[@id='leftcontainer']/table/tbody/tr[";
String second="]/td[";
String third="]";
for(int i=1;i<rowcount;i++)
{
	for(int j=1;j<colcount;j++)
	{
		String finalpart=first+i+second+j+third;
		String tabledata=driver.findElement(By.xpath(finalpart)).getText();
		System.out.print(tabledata+" | ");
	}
	System.out.println();
}

	
	}
}
