package com.timesOfIndia.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
	
	WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	/**
	 * This method will return the webelement when the xpath is dynamic.
	 * It replaces all the dynamic text with the desired text and converts it into a webelement.
	 * @param xpath
	 * @param replaceText
	 * @return
	 */
	public WebElement returnElementWithDynamicXpath(String xpath, String replaceText) {
		String x = xpath.replaceAll(Constant.DYNAMIC_XPATH_TEXT, replaceText);
		return driver.findElement(By.xpath(x));
		
	}


}
