package com.crm.tiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.crm.BaseClass.baseClass;
import com.crm.FileUtility.ExcelClass;
import com.crm.POM.Organization;

public class CreateOrgWIthIndustries extends baseClass
{
	@Test
	public void indus() throws EncryptedDocumentException, IOException
	{
		ArrayList<String> data = ExcelClass.excelData();
		
		Organization ref = new Organization(driver);
		ref.Creatorg();
		ref.orgplus();
		ref.orgname(data.get(0));
		ref.industry(data.get(1));
		ref.orgsave();
	}

}
