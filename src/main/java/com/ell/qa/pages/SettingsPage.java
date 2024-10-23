package com.ell.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ell.qa.base.TestBase;

public class SettingsPage extends TestBase{

	
	@FindBy(xpath="//button[@type='button' and @title='Add user details']")
	WebElement addUser;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	
	public SettingsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addNewUser() throws InterruptedException {
		
		
		addUser.click();
		Thread.sleep(3000);
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement contactNumber=driver.findElement(By.xpath("//input[@name='phonenumber']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		firstName.sendKeys("Sanyukta");
		lastName.sendKeys("Akhade");
		Thread.sleep(3000);
		email.sendKeys("sanyuktaakhade9@gmail.com");
		Thread.sleep(2000);
		contactNumber.sendKeys("9763630779");
		Thread.sleep(1000);
		password.sendKeys("Sany@12345");
		Thread.sleep(3000);
		save.click();
	}
}
