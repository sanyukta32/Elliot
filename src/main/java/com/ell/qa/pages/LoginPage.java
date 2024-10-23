package com.ell.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ell.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	//Page Factory  - Object Repository:
	
	@FindBy(id="outlined-required-email")
	WebElement username;
	
	@FindBy(id="outlined-required-password")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@id='Login-Elliot-Logo']")
	WebElement ellLogo;
	
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateELLImage() {
		return ellLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(3000);
		return new HomePage();
	
	}
	
	
}
