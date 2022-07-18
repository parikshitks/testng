package com.timesOfIndia.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.timesOfIndia.framework.TimesOfIndia_PageFactory_Objects;

public class TestBase {
	
	
	public static WebDriver driver;
	private TimesOfIndia_PageFactory_Objects pagefactory;
	
	
	@BeforeSuite
	public void beforeSuite() {
		//initialize webdriver
		//initialize properties
	}
	
	
	public void setBrowserType(String browser) {

		switch(browser)
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			//firefox code
			break;
		case "IE":
			//IE code
			break;
		case "Remote-chrome":
			//Remote chrome code
			break;
		}
			
		setPagefactoryObjects(new TimesOfIndia_PageFactory_Objects(driver) );
		
	}
	
	
	public TimesOfIndia_PageFactory_Objects getPagefactory() {
		return pagefactory;
	}
	
	public void setPagefactoryObjects(TimesOfIndia_PageFactory_Objects pagefactory) {
		this.pagefactory = pagefactory;
	}
	
	
	public void setEnvironment(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
