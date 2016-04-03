package com.moss.simpledateformat;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		final DateFormat df = new DateFormat();

		for (int i = 0; i < 50; i++) {
			executorService.execute(new Runnable() {
				public void run() {
					Date date = null;
					try {
						date = df.convertLongToDateSynchronized("20120405");
						//date = df.convertLongToDate("20120405");
					} catch (ParseException anException) {
						anException.printStackTrace();
					}
					System.out.println(date);
				}
			});
		}
		executorService.shutdown();
	}

}
