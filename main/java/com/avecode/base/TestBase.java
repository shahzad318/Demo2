package com.avecode.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.avecode.util.TestUtil;

public class TestBase {
	
	protected static WebDriver driver;
	static Properties prop;
	
	public TestBase(){
		
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("/Users/shahzadkahlon/Desktop/AveCode/src/main/java/com/avecode/"
							+ "config/config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e){
			e.printStackTrace();
		}			
		
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/shahzadkahlon/Downloads/chromedriver");
		    driver = new ChromeDriver();
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.chrome.driver", "/Users/shahzadkahlon/Downloads/geckodriver");
		    driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}

}
