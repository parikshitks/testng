package com.timesOfIndia.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.timesOfIndia.pages.HomePage;
import com.timesOfIndia.utility.Utils;

import bsh.util.Util;

public class HomePagefactory {
	
	private WebDriver driver;
	Utils util;

	public HomePagefactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		util = new Utils(driver);
	}


	@FindBy(how=How.ID, using=HomePage.HEADER_IMAGE)
	private WebElement headerImage;
	
	@FindBy(how=How.XPATH, using=HomePage.NAV_PANEL)
	private WebElement navPanel;
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	
	public boolean validateHeaderImage() {
		return headerImage.findElement(By.xpath(".//img[@src=\"https://static.toiimg.com/photo/79638690.cms\"]")).isDisplayed();
	}
	
	
	public boolean navPanelDisplay() {
		return navPanel.isDisplayed();
	}
	
	public void clickCategoryNavPanel(String panelName) {
		util.returnElementWithDynamicXpath(HomePage.NAV_PANEL_CATEGORY, panelName)
		.click();
	}
	

}
