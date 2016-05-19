package com.zyrs.criminalintent.util;

import java.util.Date;
import android.text.format.DateFormat;

public class DateFormats {

	public static String getLocalDate(Date date)
	{
		String dateStr = "";
		if(date != null){
		  dateStr = DateFormat.format("yyyy��MM��dd��,kk:mm", date).toString();
		}
		else{
		  dateStr = DateFormat.format("yyyy��MM��dd��,kk:mm", new Date()).toString();
		}
		return dateStr;
	}
}
