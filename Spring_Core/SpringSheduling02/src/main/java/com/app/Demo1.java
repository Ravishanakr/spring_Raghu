package com.app;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Demo1 {

	//@Scheduled(cron = "10 * * * * *")  //every minimum at 10th seconds
	//@Scheduled(cron = "* 10 * * * *")  //every hour at 10 minute 
	@Scheduled(cron = "*/10 * * * * *")  //10 minimum gap 
	public void reportService() {
		System.out.println(new Date());
	}

}
