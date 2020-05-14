package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightedTEXT {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s|c|318504235901|e|facebook|&placement=&creative=318504235901&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D9062129%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA9JbwBRAAEiwAnWa4Qx-tsx49DhG0F1Bo44SvEgIJpWRNFnQFjLRL9hCoo-xHSVzJ6ETHXxoCSs4QAvD_BwE");
				String color = driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[1]")).getCssValue("color");

				String backcolor = driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[1]")).getCssValue("background-color");

				System.out.println(color);

				System.out.println(backcolor);

				if(!color.equals(backcolor)){

				System.out.println("Text is highlighted!");

				}

				else{

				System.out.println("Text is not highlighted!");
				}
			
			


	}

}
