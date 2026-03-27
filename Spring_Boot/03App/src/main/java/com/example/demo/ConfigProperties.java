package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("com.app")
public class ConfigProperties {

	private int code;
	private String name;
	private boolean status;
	private List<String> names;
	private Map<String, String> info;
	
	private Process prop;
	
	
	

	public Process getProp() {
		return prop;
	}

	public void setProp(Process prop) {
		this.prop = prop;
	}

	public Map<String, String> getInfo() {
		return info;
	}

	public void setInfo(Map<String, String> info) {
		this.info = info;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "ConfigProperties [code=" + code + ", name=" + name + ", status=" + status + ", names=" + names
				+ ", info=" + info + ", prop=" + prop + "]";
	}

	
	

}
