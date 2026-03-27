package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConfigartionClass {

	@Bean
	@Profile({"default","qa"})
	PdfExport pdf() {
		PdfExport p = new PdfExport();
		p.setFileExt("pdf");
		p.setFileType("Document");
		return p;
	}

}
