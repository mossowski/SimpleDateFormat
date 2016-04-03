package com.moss.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);

	public Date convertLongToDateSynchronized(String date) throws ParseException {
		Date result;
		synchronized (sdf) {
			result = sdf.parse(date);
		}
		return result;
	}

	public Date convertLongToDate(String date) throws ParseException {
		Date result = sdf.parse(date);
		return result;
	}

}
