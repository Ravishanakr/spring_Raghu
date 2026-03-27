package com.example.demo.bean;

public class MyErrorResponse {

	private String date;
	private String status;
	private int code;
	private String message;

	public MyErrorResponse(String date, String status, int code, String message) {
		super();
		this.date = date;
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyErrorResponse [date=" + date + ", status=" + status + ", code=" + code + ", message=" + message + "]";
	}

}
