package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_product")
public class Product {

	@Id
	private Integer pId;
	private String pCode;

	@OneToMany
	@JoinColumn(name = "pid")
	List<Model> models;

	public Product() {

	}

	public Product(Integer pId, String pCode, List<Model> models) {
		super();
		this.pId = pId;
		this.pCode = pCode;
		this.models = models;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

}
