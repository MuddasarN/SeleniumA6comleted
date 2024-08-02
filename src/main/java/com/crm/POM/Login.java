package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//input[@name='user_name']")
	WebElement user;
	
	private @FindBy(xpath = "//input[@name='user_password']")
	WebElement pass;
	
	private @FindBy(xpath = "//input[@id='submitButton']")
	WebElement logn;
	
	public void user(String username)
	{
		user.sendKeys(username);
	}
	public void pass(String password)
	{
		pass.sendKeys(password);
	}
	public void logn()
	{
		logn.click();
	}

}
