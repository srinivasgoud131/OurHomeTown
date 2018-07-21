package com.qa.oht.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	FileInputStream fp;

	// read properties file with default constructor
	public TestBase() {
		try {
			prop=new Properties();
			fp = new FileInputStream(
					"C:\\Users\\srinivas\\Selenium_IDE\\OurHomeTown\\src\\main\\java\\com\\qa\\oht\\config\\config.properties");
			prop.load(fp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String Browser = prop.getProperty("browser");
		if (Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLibs\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

		}
		else{
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumLibs\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
	}

}