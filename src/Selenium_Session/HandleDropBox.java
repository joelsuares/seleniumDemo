package Selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chr1\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.youtube.com");
		
		Select select = new Select(driver1.findElement(By.id("fdghjk")));
		select.selectByVisibleText("califirnia");

	}

}
