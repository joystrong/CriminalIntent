package com.zyrs.criminalintent.util;

import java.util.Date;
import android.text.format.DateFormat;

/**
 * 日期格式转换
 * @author Administrator
 *
 */
public class DateFormats {

	public static String getLocalDate(Date date)
	{
		String dateStr = "";
		if(date != null){
		  dateStr = DateFormat.format("yyyy年MM月dd日,kk:mm", date).toString();
		}
		else{
		  dateStr = DateFormat.format("yyyy年MM月dd日,kk:mm", new Date()).toString();
		}
		return dateStr;
	}
}
