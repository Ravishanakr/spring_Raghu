package com.app;

import org.springframework.stereotype.Component;

@Component
public class MyRepo {

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
