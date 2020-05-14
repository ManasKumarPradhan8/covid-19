package banglore_Company.datadriven_GCREDDY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s=new Select(dr.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		//s.selectByIndex(4);
		s.selectByIndex(6);
//dr.close();
	}

}
