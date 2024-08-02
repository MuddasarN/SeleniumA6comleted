package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilityClass
{
	
		public static String Logindata(String key) throws IOException
		{
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\ACER\\eclipse-workspace\\com.crm.VTiger\\src\\test\\resources\\LoginFunction.properties");
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
		}

	}



