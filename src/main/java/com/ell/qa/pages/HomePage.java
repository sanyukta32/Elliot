package com.ell.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ell.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//div[@class='flex flex-row flex-wrap m-4 justify-start']")
	WebElement usernameLabel;
	
	@FindBy(xpath="//li[normalize-space()='EMA']")
	WebElement emaPage;
	
	@FindBy(xpath="//li[normalize-space()='All Devices']")
	WebElement alldevices;
	
	@FindBy(xpath="//a[@title='Real Time']//*[name()='svg']")
	WebElement realTime;
	
	@FindBy(xpath="//a[@title='Historical Table']")
	WebElement historicalTable;
	
	
	@FindBy(xpath="//span[@title='Alerts']//*[name()='svg']")
	WebElement notification;
	
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-l6qbzq']")
	WebElement clickOnSettings;
	
	@FindBy(xpath="(//li[normalize-space()='Settings'])[1]")
	WebElement clickOnSettingsIcon;

	
	@FindBy(xpath="//span[@title='Profile']")
	WebElement profile;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		}
	
	public boolean verifyCorrectUserName()
	{
		return usernameLabel.isDisplayed();
		
	}
	
	
	public EmaPage clickOnEmaPage() {
		Select select = new Select (driver.findElement(By.cssSelector("div[id=':r1l:']")));
		select.getFirstSelectedOption();
		
		driver.findElement(By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']")).click();
		
		emaPage.click();
		return new EmaPage();
		
	}
	
	public AllDevicesPage clickOnAllDevices() {
		alldevices.click();
		return new AllDevicesPage();
		
	}
	
	public RealTimePage clickOnRealTime() throws InterruptedException {
		realTime.click();
		Thread.sleep(3000);
		return new RealTimePage();
		
	}

	public HistoricalTablePage clickOnHistoricalTable() throws InterruptedException {
		historicalTable.click();
		Thread.sleep(3000);
		return new HistoricalTablePage();
		
	}


	public NotificationPage clickOnNotificationPage() throws InterruptedException {
		
		notification.click();
		Thread.sleep(3000);
		return new NotificationPage();
		
	}
	
	public SettingsPage clickOnSettingsPage() throws InterruptedException {
		
		profile.click();
		Actions action= new Actions(driver);
		action.moveToElement(clickOnSettings).build().perform();
		clickOnSettingsIcon.click();
		Thread.sleep(3000);
		return new SettingsPage();
		
		
	}
	
	
	

}
