package com.example.demo.entity;

public class Product {

	private Integer pid;
	private String pcode;

	public Product(Integer pid, String pcode) {
		super();
		this.pid = pid;
		this.pcode = pcode;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + "]";
	}

}
