package com.ell.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ell.qa.base.TestBase;
import com.ell.qa.pages.HomePage;
import com.ell.qa.pages.LoginPage;

public class LoginPageTest  extends TestBase  {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Elliot Systems");
	}
	
	@Test(priority=2)  
	public void ellLogoImageTest() {
		boolean flag = loginPage.validateELLImage();
		Assert.assertTrue(true, "Logo Matched");
	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
