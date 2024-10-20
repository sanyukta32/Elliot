package com.ell.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ell.qa.base.TestBase;
import com.ell.qa.pages.HomePage;
import com.ell.qa.pages.LoginPage;
import com.ell.qa.pages.SignUpPage;


public class SignUpPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SignUpPage signUpPage;
	
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Test(priority=1)
	public void verifySignUpPageTitleTest() {
		String homePageTitle = signUpPage.verifySignUpPageTitle();
		Assert.assertEquals(homePageTitle, "Elliot Systems", "Home Page Title not matched");
	}
	
	@Test(priority=2)
	public void verifyNotificationPageTest()
	{
		 signUpPage.clickOnNotificationPage();
	}
		
	@Test(priority=3)
	public void verifySettingsPageTest()
	{
		 signUpPage.clickOnSettingsPage();
	}
		
	
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	
		
	}
}
