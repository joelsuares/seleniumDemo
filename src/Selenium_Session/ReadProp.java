	package Selenium_Session;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// how to read properties file

		WebDriver driver=null;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C://Users//Kiran B T//workspace//Selenium_complete_Naveen//src//Selenium_Session//config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("browser"));

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chr1\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equals("FF")){
			driver=new FirefoxDriver();
		}else if(browsername.equals("safari")){
			driver=new SafariDriver();
		}else if(browsername.equals("IE")){
			driver=new InternetExplorerDriver();
		}else{
			System.out.println("no browser value given");
		}
		
		driver.get(prop.getProperty("url"));


	}
 
}
