package com.gcr.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gcr.util.ConfiguratorSupport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
public static WebDriver driver;
public ConfiguratorSupport cs=new ConfiguratorSupport();
@BeforeClass
public void beforeclass()
{
	WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public static void test1()
{
	
}
@AfterClass
public void afterclass()
{
	driver.quit();
	
}
}
