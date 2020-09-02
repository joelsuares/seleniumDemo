package Selenium_Session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chr1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("Please enter a valid user name")){
			System.out.println("correct alert msg");
		}else{
			System.out.println("Incorrect msg");
		}
		alert.accept();

	}

}
