package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_model")
public class Model {

	//one product having multiple Models
	
	@Id
	private Integer modelId;
	private String modelCode;
	private String modelData;

	
	public Model() {

	}
	
	public Model(Integer modelId, String modelCode, String modelData) {
		super();
		this.modelId = modelId;
		this.modelCode = modelCode;
		this.modelData = modelData;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelData() {
		return modelData;
	}

	public void setModelData(String modelData) {
		this.modelData = modelData;
	}

}
