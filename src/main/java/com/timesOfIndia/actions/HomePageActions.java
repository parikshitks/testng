package com.timesOfIndia.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.timesOfIndia.pagefactory.HomePagefactory;

public class HomePageActions {

	WebDriver driver;
	HomePagefactory home;

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
		home = new HomePagefactory(driver);
	}


	/**
	 * This method will validate if the home page image
	 * for Times Of India is displaying or not
	 */
	public void validateHomeImage() {
		if(home.validateHeaderImage()) {
			//Implement logger
		}
		else {
			//Implement logger
			Assert.fail("Home page image is not displayed");
		}
	}

	/**
	 * This method will validate if the home page navigation panel
	 * is displaying or not
	 */
	public void validateNavPanel() {
		if(home.navPanelDisplay()) {
			//Implement logger
		}
		else {
			//Implement logger
			Assert.fail("Home page navigation panel is not displayed");
		}
	}

	/**
	 * This method will select the desired panel category from the home page nav panel.
	 * @param navPanelTitle
	 */
	public void selectCategoryFromNavPanel(String navPanelTitle) {
		try 
		{	
			home.clickCategoryNavPanel(navPanelTitle);
		}
		catch(Exception e)
		{
			//Implement logger
			Assert.fail("Unable to select the provided category from the panel");
		}
	}

}
