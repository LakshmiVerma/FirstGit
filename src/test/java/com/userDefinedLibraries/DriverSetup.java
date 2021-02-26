package com.userDefinedLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	public static WebDriver driver;
	public static String exepath;
	//public static String url = "https://www.google.com/";
	public static String browsertype;

	/*Instantitation of chrome and firefox browsers with the help of corresponding drivers 
	 * First it invoke the Browser
	 * Then maximize the browser window
	 * And close the browser 
	 * */

	public static WebDriver driverInstantiate(String browser) {

		browsertype = browser;

		if (browsertype.equalsIgnoreCase("chrome")) {

			exepath = "C:\\eclipse\\driver\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", exepath);

			driver = new ChromeDriver();

		} else if (browsertype.equalsIgnoreCase("firefox")) {

			exepath = "C:\\eclipse\\driver\\geckodriver.exe";

			System.setProperty("webdriver.gecko.driver", exepath);

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		return driver;
	}

	// Closing the drivers
	public static void driverClose() {

		driver.close();
	}

}
