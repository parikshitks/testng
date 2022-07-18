package com.timesOfIndia.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.timesOfIndia.utility.TestBase;

public class HomePageCategoryPanel extends TestBase {
	
	private String baseUrl = "https://timesofindia.indiatimes.com/";


	@BeforeTest
	public void setUp() {

		setBrowserType("Chrome");

	}

	@BeforeMethod
	public void before() {
		//Logger
		//Assign author
	}


	@Test(priority=1,
			enabled=true,
			groups= {"Regression", "Smoke"}
			)
	public void validateHomePanel() {

		setEnvironment(baseUrl);
		getPagefactory().getHomePage().validateHomeImage();
		getPagefactory().getHomePage().validateNavPanel();

	}


	@Test(priority=2,
			enabled=true,
			groups= {"Regression", "Smoke"}
			)
	public void validateCategories() {
		setEnvironment(baseUrl);
		getPagefactory().getHomePage().selectCategoryFromNavPanel("Cricket");

	}
	
	@AfterMethod
	public void after() {
		//setup on pass and failure conditions
	}


	@AfterTest
	public void tearDown() {
		//driver.quit();
	}




}
