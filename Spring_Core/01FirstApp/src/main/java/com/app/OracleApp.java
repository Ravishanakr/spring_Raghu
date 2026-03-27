package com.app;

public class OracleApp {

	private String driver;
	private String url;

	public OracleApp() {
		super();
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "OracleApp [driver=" + driver + ", url=" + url + "]";
	}

}
