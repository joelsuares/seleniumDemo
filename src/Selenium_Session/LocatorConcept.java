package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chr1\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.youtube.com");
	}

}
