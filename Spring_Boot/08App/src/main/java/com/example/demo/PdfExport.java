package com.example.demo;

public class PdfExport {

	private String fileExt;
	private String fileType;

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Override
	public String toString() {
		return "PdfExport [fileExt=" + fileExt + ", fileType=" + fileType + "]";
	}

}
