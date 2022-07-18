package com.timesOfIndia.framework;

import org.openqa.selenium.WebDriver;

import com.timesOfIndia.actions.HomePageActions;

public class TimesOfIndia_PageFactory_Objects {
	
	
	private HomePageActions homePage;
	
	
	public TimesOfIndia_PageFactory_Objects(WebDriver driver) {
		homePage = new HomePageActions(driver);
	}
	
	
	public HomePageActions getHomePage() {
		return homePage;
	}

}
