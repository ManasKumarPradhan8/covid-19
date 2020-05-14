package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_load_check {

	public static void main(String[] args) {
		
	/*    WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		String ele="//*[@id='container']/div/div[2]/div/ul/li[9]/a/span";
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele))).click();
		System.out.println("clicked on element successfully");
		driver.close();*/
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();
		WebDriverWait wait=new WebDriverWait(driver,10);
		String element="//*[@id='container']/div[2]/div";
		wait.until(ExpectedConditions.visi)
				}

}
