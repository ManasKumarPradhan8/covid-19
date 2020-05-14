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

public class Table1_bhanu {
static WebDriver driver;
	@Test
	public static void GETDATA() throws ParseException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int tableROWnum=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr")).size();
		System.out.println("table row number is"+tableROWnum);
String Text3=driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr[3]/td[1]")).getText();
System.out.println("3rd row 1st col data is"+Text3);
int colsize_in_1st_row=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td")).size();
System.out.println("no of cols in first row is"+colsize_in_1st_row);
//WRITING XPATH OF  WEBTABLE TO OBTAIN DATA




//VIDEO2
//THIS XPATH IS MORE RELIABLE
String data=driver.findElement(By.xpath("//*[contains(text(),'Sri Adhikari Bro')]/parent::*/following-sibling::td[3]")).getText();
System.out.println(data);



//VIDEO3
//finding the biggest element
String row="//*[@class='dataTable']/tbody/tr";
int ROWcOUNT=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr")).size();
WebElement currentprice=driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr/td[3]"));
String firstpart="//*[@id='leftcontainer']/table/tbody/tr[";
	String secondpart="	]/td[3]/";
	ArrayList<Integer>array=new ArrayList<Integer>();
for(int i=1;i<ROWcOUNT;i++)
{
	String finalpart=firstpart+i+secondpart;
	System.out.println(finalpart);
	String price=driver.findElement(By.xpath(finalpart)).getText();
	System.out.println(price);
	NumberFormat numberformat=NumberFormat.getNumberInstance();
	Number num=numberformat.parse(price);
	price=num.toString();
	System.out.println(price);
	Double m=Double.parseDouble(price);
	int intprice=m.intValue();
	array.add(intprice);
	
}
Collections.sort(array);
System.out.println(array.get(0));
System.out.println(array.get(array.size()-1));

		driver.close();
	}
}
