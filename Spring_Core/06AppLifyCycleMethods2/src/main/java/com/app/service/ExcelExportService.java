package com.app.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExportService implements InitializingBean, DisposableBean {

	private String fileName;
	private String mode;

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

	@Override
	public void destroy() throws Exception {
		System.out.println("FROM DESTROY METHOD");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM INIT METHOD");

	}

}
