package com.ell.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ell.qa.base.TestBase;
import com.ell.qa.pages.AllDevicesPage;
import com.ell.qa.pages.EmaPage;
import com.ell.qa.pages.HistoricalTablePage;
import com.ell.qa.pages.HomePage;
import com.ell.qa.pages.LoginPage;
import com.ell.qa.pages.RealTimePage;
import com.ell.qa.pages.SettingsPage;

public class SettingsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SettingsPage settingsPage;
	
	EmaPage emaPage;
	AllDevicesPage allDevicesPage;
	RealTimePage realTimePage;
	HistoricalTablePage historicalPage;
	
	public SettingsPageTest()
	{
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		settingsPage = new SettingsPage();
		emaPage= new EmaPage();
		allDevicesPage = new AllDevicesPage();
		realTimePage = new RealTimePage();
		historicalPage = new HistoricalTablePage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	
		
	}
	
	

	@Test(priority=1)
	public void verifySettingsPageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Elliot Systems", "Home Page Title not matched");
	}
	
	
	@Test(priority=2)
	public void validateNewAddUser() throws InterruptedException {
		homePage.clickOnSettingsPage();
		settingsPage.addNewUser();
		
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	
		
	}

}
