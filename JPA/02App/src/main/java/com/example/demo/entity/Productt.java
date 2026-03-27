package com.example.demo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKey;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;

@Entity
public class Productt {

	@Id
	private Integer pId;
	private String pCode;

	@ElementCollection
	@CollectionTable(name = "product_clors", joinColumns = @JoinColumn(name = "pidfk"))
	@OrderColumn(name = "ind")
	private List<String> colors;

	@ElementCollection
	@CollectionTable(name = "t_model", joinColumns = @JoinColumn(name = "pidfk"))
	private Set<String> models;

	@ElementCollection
	@CollectionTable(name = "t_details", joinColumns = @JoinColumn(name = "pidfk"))
	@MapKeyColumn(name = "code")
	private Map<String, String> details;

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

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

}
