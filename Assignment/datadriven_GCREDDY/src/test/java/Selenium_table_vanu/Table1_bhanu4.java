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

public class Table1_bhanu4 {// FETHCHING THE BIGGEST FROM THE TABLE//RUNNING SUCCESSFULLY
	static WebDriver driver;

	@Test
	public static void GETDATA() throws ParseException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// VIDEO3
		// finding the biggest element
		String row = "//*[@id='leftcontainer']/table/tbody/tr";
		int ROWcOUNT = driver.findElements(By.xpath(row)).size();
		System.out.println(ROWcOUNT);
		WebElement currentprice = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
		String firstpart = "//*[@id='leftcontainer']/table/tbody/tr[";
		String secondpart = "]/td[3]";
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 1; i < ROWcOUNT; i++) {
			String finalpart = firstpart + i + secondpart;
			System.out.println(finalpart);
			String price = driver.findElement(By.xpath(finalpart)).getText();
			System.out.println("String Price:"+price);
			NumberFormat numberformat = NumberFormat.getNumberInstance();
			Number num = numberformat.parse(price);
			price = num.toString();
			System.out.println("NumberFormaat Price:"+price);
			Double m = Double.parseDouble(price);
			System.out.println("Double Price:"+m);
			int intprice = m.intValue();
			System.out.println("Integer Price"+intprice);
			array.add(intprice);

		}
		Collections.sort(array);
		System.out.println(array.get(0));
		System.out.println(array.get(array.size() - 1));

		driver.close();
	}
}
//https://www.pornhub.org/view_video.php?viewkey=ph5a8ec40accd87//