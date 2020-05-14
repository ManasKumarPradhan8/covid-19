package projects.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#name")).sendKeys("manas");
		driver.findElement(By.cssSelector(".btn-style")).click();
		String alertText=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertText);

	}

}
