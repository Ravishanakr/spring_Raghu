package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private ExportExcelService service;
	
	@Autowired
	private PdfExport service2;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service);
		System.out.println(service2);
	}

}
