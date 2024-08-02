package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//a[text()='Calendar']")
	WebElement calender;
	
	private @FindBy(xpath = "//a[text()='Leads']")
	WebElement lead;
	
	private @FindBy(xpath = "//a[text()='Organizations']")
	WebElement organization;
	
	private @FindBy(xpath = "//a[text()='Contacts']")
	WebElement contact;
	
	private @FindBy(xpath = "//a[text()='Opportunities']")
	WebElement oppertunities;
	
	private @FindBy(xpath = "//a[text()='Products']")
	WebElement product;
	
	private @FindBy(xpath = "//a[text()='Documents']")
	WebElement document;
	
	private @FindBy(xpath = "//a[text()='Email']")
	WebElement mail;
	
	private @FindBy(xpath = "//a[text()='Trouble Tickets']")
	WebElement troublet;
	
	private @FindBy(xpath = "//a[text()='Dashboard']")
	WebElement dashboard;
	
	public void calender()
	{
		calender.click();
	}
	public void lead()
	{
		lead.click();
	}
	public void organization() 
	{
		organization.click();
	}
	public void contact()
	{
		contact.click();
	}
	public void oppertunities()
	{
		oppertunities.click();
	}
	public void product()
	{
		product.click();
	}
	public void document()
	{
		document.click();
	}
	public void mail()
	{
		mail.click();
	}
	public void troublet()
	{
		troublet.click();
	}
	public void dashboard()
	{
		dashboard.click();
		
	}
	
	

}
