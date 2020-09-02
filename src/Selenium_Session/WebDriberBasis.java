package Selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriberBasis {
	
	public void browser(WebDriver driver){
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		if(title.equalsIgnoreCase("youtube")){
			System.out.println("Correct title");
		}else{
			System.out.println("Incorrect title");
		}
		
		driver.quit();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.firebox driver
		System.setProperty("webdriver.gecko.driver", "D:\\selenium software\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.youtube.com");
		
		//2.Chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chrome\\chromedriver.exe");
//		WebDriver driver1=new ChromeDriver();
//		driver1.get("https://www.youtube.com");
		
		WebDriberBasis obj=new WebDriberBasis();
		//obj.browser(new FirefoxDriver());
		obj.browser(new ChromeDriver());

	}

}
