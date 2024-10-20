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

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	EmaPage emaPage;
	AllDevicesPage allDevicesPage;
	RealTimePage realTimePage;
	HistoricalTablePage historicalPage;
	
	
	public HomePageTest()
	{
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		emaPage= new EmaPage();
		allDevicesPage = new AllDevicesPage();
		realTimePage = new RealTimePage();
		historicalPage = new HistoricalTablePage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Elliot Systems", "Home Page Title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName()); 
		
	}

	
	@Test(priority=3)
	public void verifyEmaPageTest()
	{
		emaPage = homePage.clickOnEmaPage();
	}
	
	@Test(priority=4)
	public void verifyAllDeviceTest() {
		allDevicesPage = homePage.clickOnAllDevices();
		
	}
	
	@Test(priority=5)
	public void verifyRealTimePageTest()
	{
		realTimePage = homePage.clickOnRealTime();
	}
	
	@Test(priority=6)
	public void verifyHistoricalPageTest()
	{
		historicalPage = homePage.clickOnHistoricalTable();
	}
	
	
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	
		
	}
}
