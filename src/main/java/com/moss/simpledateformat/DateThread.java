package com.moss.simpledateformat;

import static com.moss.simpledateformat.App.*;

public class DateThread extends Thread {

	@Override
	public void run() {
		String formatDate = sdf.format(date2);
		System.out.println("Formatted Date 2 : " + formatDate);
	}
}
