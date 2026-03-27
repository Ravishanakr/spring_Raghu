package com.example.demo.entiy;

public class Book {

	private Integer bid;
	private String bname;
	private String bauth;
	private Double bcost;

	public Book(Integer bid, String bname, String bauth, Double bcost) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauth = bauth;
		this.bcost = bcost;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauth() {
		return bauth;
	}

	public void setBauth(String bauth) {
		this.bauth = bauth;
	}

	public Double getBcost() {
		return bcost;
	}

	public void setBcost(Double bcost) {
		this.bcost = bcost;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauth=" + bauth + ", bcost=" + bcost + "]";
	}

}
