package com.crm.tiger;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.BaseClass.baseClass;
import com.crm.POM.Organization;

public class CreateOrganization extends baseClass
{
	@Test
	public void org()
	{
//		String expected_result = "sriram laptop";
		Organization ref =  new Organization(driver);
		ref.Creatorg();
		ref.orgplus();
		ref.orgname("sriram laptop");
		ref.orgsave();
		
//		String actual_result = driver.findElement(By.xpath("//span[contains(text(),'[ ACC3 ] sriram laptop -  Organization Information')]")).getText();
//		assertEquals(expected_result, actual_result);
		
	}

}
