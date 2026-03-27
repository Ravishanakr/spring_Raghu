package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Service {

	@Autowired
	public Tocken tocken;

	public Tocken getTocken() {
		// tocken = getMyToken();
		return tocken;
	}

//	@Lookup
//	public Tocken getMyToken() {
//		// container provides
//		return null;
//	}

	public void setTocken(Tocken tocken) {
		this.tocken = tocken;
	}

}
