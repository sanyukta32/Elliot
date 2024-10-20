package com.ell.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ell.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[@style='margin-bottom: 11px;']")
	WebElement usernameLabel;
	
	@FindBy(xpath="//*[@id=\"SvgjsSvg1001\"]")
	WebElement emaPage;
	
	@FindBy(xpath="//li[@role='option' and @data-value='all']")
	WebElement alldevices;
	
	@FindBy(xpath="//a[(@title='Real Time')]")
	WebElement realTime;
	
	@FindBy(xpath="//a[(@title='Historical Table')]")
	WebElement historicalTable;

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
	
	public void selectDevices(String SelectDevice)
	{	
		driver.findElement(By.id(":rd:-label")).click();;
	}
	
	public EmaPage clickOnEmaPage() {
		emaPage.click();
		return new EmaPage();
		
	}
	
	public AllDevicesPage clickOnAllDevices() {
		alldevices.click();
		return new AllDevicesPage();
		
	}
	
	public RealTimePage clickOnRealTime() {
		realTime.click();
		return new RealTimePage();
		
	}

	public HistoricalTablePage clickOnHistoricalTable() {
		historicalTable.click();
		return new HistoricalTablePage();
		
	}

	public AllDevicesPage clickOnAllDevices1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
