package projects.naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBOX {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isEnabled());
driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isEnabled());

System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
