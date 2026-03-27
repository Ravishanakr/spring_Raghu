package com.app.service;

import org.springframework.stereotype.Component;

@Component
public class ExcelExportService {

	private String fileName;
	private String mode;

	public void setup() {
		// lot of code...
		System.out.println("FROM INIT METHOD");
	}

	public void clean() {
		// some code..
		System.out.println("FROM DESTORY METHOD");
	}

	public ExcelExportService() {
		super();
		System.out.println("OBJECT CREATED");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		System.out.println("INJECT THROUGH SETTER METHOD");
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}

}
