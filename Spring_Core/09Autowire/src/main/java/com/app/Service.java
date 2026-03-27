package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {

	
	@Autowired
	@Qualifier("repoo")
	private MyRepo repoo;

	public MyRepo getRepo() {
		return repoo;
	}

	public void setRepo(MyRepo repo) {
		this.repoo = repo;
	}

	@Override
	public String toString() {
		return "Service [repo=" + repoo + "]";
	}

}
