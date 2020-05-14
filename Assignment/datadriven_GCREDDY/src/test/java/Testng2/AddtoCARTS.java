package Testng2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddtoCARTS {
	@Test
	public static void method() {
		int j = 0;
		// System.setProperty("webdriver.chrome.driver","‪E:/Udemy_all_jars/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","‪‪E:\\ALLseleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsneeded = { "Cucumber", "Brocolli" };
		List<String> newcreatedlist = Arrays.asList(itemsneeded);
		List<WebElement> allItems = driver.findElements(By.xpath("//div[@class='product']"));
		for (int i = 0; i < allItems.size(); i++) {
			String[] name = allItems.get(i).getText().split("-");
			String formattedname = name[0].trim();
			// format the name to get actual vegetable name only
			if (allItems.contains(formattedname)) {
				j++;
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				if (j == 3) {
					break;
				}
			}
		}
	}

}
