package com.app;

public class Tocken {

	private String tocken;

	public Tocken() {

		System.out.println("Constructor");
	}

	public String getTocken() {
		return tocken;
	}

	public void setTocken(String tocken) {
		this.tocken = tocken;
	}

	@Override
	public String toString() {
		return "Tocken [tocken=" + tocken + "]";
	}

}
