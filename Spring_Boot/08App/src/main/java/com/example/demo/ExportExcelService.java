package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"qa","default"})
public class ExportExcelService {

	@Value("csv")
	private String extCode;

	@Value("#{new java.util.Random().nextInt()}")
	private Integer formaterId;

	public String getExtCode() {
		return extCode;
	}

	public void setExtCode(String extCode) {
		this.extCode = extCode;
	}

	public Integer getFormaterId() {
		return formaterId;
	}

	public void setFormaterId(Integer formaterId) {
		this.formaterId = formaterId;
	}

	@Override
	public String toString() {
		return "ExportExcelService [extCode=" + extCode + ", formaterId=" + formaterId + "]";
	}

}
