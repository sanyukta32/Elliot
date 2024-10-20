package com.ell.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ell.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	 private SignUpPage signUpPage;
	
	
	@FindBy(id="SvgjsSvg1001")
	WebElement notification;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/span[4]/div/div")
	WebElement clickOnSettings;

	
	public SignUpPage() {
		this.signUpPage = new SignUpPage();
		//PageFactory.initElements(driver, this);
	}
	
	public String verifySignUpPageTitle() {
		return driver.getTitle();
		}
	
	public NotificationPage clickOnNotificationPage() {
	
		notification.click();
		return new NotificationPage();
		
	}
	
	public SettingsPage clickOnSettingsPage() {
		clickOnSettings.click();
		return new SettingsPage();
		
	}
}
