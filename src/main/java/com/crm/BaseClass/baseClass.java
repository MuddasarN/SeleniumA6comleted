package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.FileUtility.utilityClass;
import com.crm.POM.Login;

public class baseClass 
{
	public static WebDriver driver;
//	@Parameters({"browser","url"})
	@BeforeClass
	public void preCondition() throws IOException
	{
		String browser = utilityClass.Logindata("browser");
		String url = utilityClass.Logindata("url");
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		String username = utilityClass.Logindata("username");
		String password = utilityClass.Logindata("password");
		Login ref = new Login(driver);
		ref.user(username);
		ref.pass(password);
		ref.logn();
		
	}
	@AfterMethod
	public void logout()
	{
		
	}
	@AfterClass
	public void postCondition()
	{
		
	}
	

}
