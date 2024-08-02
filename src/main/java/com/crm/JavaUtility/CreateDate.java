package com.crm.JavaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreateDate 
{
	public static String startDate(String key) throws InterruptedException
	{
        Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-mm-dd");
		String currentDate = sim.format(date);
	     return currentDate;
	}
	public static String endDate( String key) throws InterruptedException {
		startDate(key);
		SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal=sim.getCalendar();
		
        cal.add(Calendar.DAY_OF_MONTH, 30);
	    String afterDate = sim.format(cal.getTime());
	    return afterDate;
	
	}

}
