package com.crm.tiger;

import org.testng.annotations.Test;

import com.crm.BaseClass.baseClass;
import com.crm.POM.StartEndDate;

public class CreateContactWithStartAndEndDate extends baseClass
{
	@Test
	public void sedate() throws InterruptedException
	{
		StartEndDate ref = new StartEndDate(driver);
		ref.contact();
		ref.plusimg();
		ref.fname(1);
		ref.lname("muddasar");
		Thread.sleep(3000);
		ref.stardate();
		Thread.sleep(3000);
		ref.enddate();
		ref.save();
	}
}
