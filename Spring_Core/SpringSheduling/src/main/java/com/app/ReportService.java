package com.app;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportService {

	@Scheduled(fixedDelay = 3000) //in milliseconds
	public void generateReport() {
		System.out.println("Generate Report" + new Date());

	}

}
