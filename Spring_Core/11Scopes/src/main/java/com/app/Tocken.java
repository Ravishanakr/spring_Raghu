package com.app;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Tocken {

	private Integer tocken;

	public Tocken() {
		Random random = new Random();
		tocken = random.nextInt();
	}

	public Integer getTocken() {
		return tocken;
	}

	public void setTocken(Integer tocken) {
		this.tocken = tocken;
	}

	@Override
	public String toString() {
		return "Tocken [tocken=" + tocken + "]";
	}

}
