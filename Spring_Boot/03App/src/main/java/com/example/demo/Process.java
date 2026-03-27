package com.example.demo;

public class Process {

	int sId;
	String sName;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Process [sId=" + sId + ", sName=" + sName + "]";
	}

}
