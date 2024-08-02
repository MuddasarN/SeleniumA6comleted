package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.JavaUtility.CreateDate;


public class StartEndDate 
{
	public StartEndDate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//a[text()='Contacts']")
	WebElement contact;
	
	private @FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusimg;
	
	private @FindBy(xpath = "//select[@name='salutationtype']")
	WebElement fname;
	
	private @FindBy(xpath = "//input[@name='lastname']")
	WebElement lname;
	
	private @FindBy(xpath = "//input[@value='2024-07-31']")
	WebElement stardate;
	
	private @FindBy(xpath = "//input[@name='support_end_date']")
	WebElement enddate;
	
	private @FindBy(xpath = "//input[@name='button']")
	WebElement save_btn;
	
	public void contact()
	{
		contact.click();
	}
	public void plusimg()
	{
		plusimg.click();
	}
	public void fname(int i)
	{
		fname.click();
		Select sel = new Select(fname);
		sel.selectByIndex(i);
	}
	public void lname(String name)
	{
		lname.sendKeys(name);
	}
	public void stardate() throws InterruptedException
	{
		 String s_date=CreateDate.startDate("currentDate");
		 
		 stardate.sendKeys(s_date);
	}
	public void enddate() throws InterruptedException
	{
		String e_date = CreateDate.endDate("afterDate");
		enddate.sendKeys(e_date);
	}
	public void save()
	{
		save_btn.click();
	}

}
