package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HandlerInfo {

	@Value("data")
	//to hard code direct values
	private String reslover;
	@Value("temp")
	private String pathToStore;

	public String getReslover() {
		return reslover;
	}

	public void setReslover(String reslover) {
		this.reslover = reslover;
	}

	public String getPathToStore() {
		return pathToStore;
	}

	public void setPathToStore(String pathToStore) {
		this.pathToStore = pathToStore;
	}

	@Override
	public String toString() {
		return "HandlerInfo [reslover=" + reslover + ", pathToStore=" + pathToStore + "]";
	}

}
