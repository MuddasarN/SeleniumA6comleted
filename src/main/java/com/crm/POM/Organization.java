package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Organization 
{
	public Organization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private@FindBy(xpath = "//a[text()='Organizations']")
	WebElement Creatorg;
	
	private @FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement orgplus;
	
	private @FindBy(xpath = "//input[@name='accountname']")
	WebElement orgname;
	
	private @FindBy(xpath = "//input[@name='button']")
	WebElement orgsave;
	
	private @FindBy(xpath = "//select[@name='industry']")
	WebElement industry;
	
	public void Creatorg()
	{
		Creatorg.click();
	}
	public void orgplus()
	{
		orgplus.click();
	}
	
	public void orgname(String name) 
	{
		
		orgname.sendKeys(name);
	}
	public void orgsave()
	{
		orgsave.click();
	}
	public void industry(String ind)
	{
		
		Select sel = new Select(industry);
		sel.selectByVisibleText(ind);
		
	}
	

}
