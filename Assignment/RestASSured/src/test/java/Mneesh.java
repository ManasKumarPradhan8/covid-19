import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mneesh {

	FileInputStream fi;
	XSSFWorkbook wb;
	XSSFSheet ws;
	XSSFRow r;
	FileOutputStream fo;
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
   // System.setProperty("webdriver.chrome.driver", "E:\\newchromedriver\\chromedriver.exe");
   // driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void login() throws InterruptedException, IOException
	{
		driver.get("http://dev.nidos.in/");	

//	fi = new FileInputStream("‪‪‪E:/ALLseleniumfiles/testdata.xlsx");
	fi=new FileInputStream("E:/ALLseleniumfiles/testdata.xlsx");
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet("Login");
	r=ws.getRow(0);
	int rc=ws.getLastRowNum();
	int cc=r.getLastCellNum();
	Reporter.log("no of rows are ::" +rc+" "+"no of columns are ::" +cc,true);
	for (int i = 1; i <=rc; i++) 
	{
	driver.manage().window().maximize();
	String username = ws.getRow(i).getCell(1).getStringCellValue();
	String password = ws.getRow(i).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).clear();
	driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).clear();
	driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@class='btn btn-primary block login-button']")).click();
	Thread.sleep(4000);
	if(driver.getCurrentUrl().contains("nidos")) 
	{
	ws.getRow(i).createCell(3).setCellValue("pass");
	ws.getRow(i).createCell(4).setCellValue("Login success");
	driver.findElement(By.xpath("//div[@class='right_section']//div[3]")).click();
	//driver.close();
	}
	
	else if((driver.getCurrentUrl().contains("returnUrl")))  {
		ws.getRow(i).createCell(3).setCellValue("Fail");
		ws.getRow(i).createCell(4).setCellValue("Login Unsuccess");
		//String message = driver.findElement(By.id("toast-container")).getText();
		//ws.getRow(i).createCell(3).setCellValue(message);
		//driver.close();
	}
	}
	fi.close();
    fo=new FileOutputStream("‪‪‪E:\\ALLseleniumfiles\\output\\testdata.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
	}
	@AfterTest
	public void logout()
	{
		driver.close();	
	}

}

