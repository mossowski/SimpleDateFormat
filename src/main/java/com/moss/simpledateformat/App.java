package com.moss.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class App extends Thread {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH);
	public static Date date1 = new Date(523213);
	public static Date date2 = new Date(123124123);

	@Override
	public void run() {
		String formatDate = sdf.format(date1);
		System.out.println("Formatted Date 1 : " + formatDate);
	}

	public static void main(String[] args) {
		System.out.println("Date 1           : " + date1);
		System.out.println("Date 2           : " + date2);
		for (int i = 0; i < 15; i++) {
			(new App()).start();
			(new DateThread()).start();
		}
	}
}
