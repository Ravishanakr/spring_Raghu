package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{5+3}")
	private int code;

	@Value("#{data.number}")
	private int value;
	
	//@Value("#{new java.util.Random().nextInt() } ")
	@Value(" #{ T(java.lang.Math).abs(-9)}")
	private int otp;
	
	public int getOtp() {
		return otp;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getValue() {
		return value;
	}

	
	
	
}
