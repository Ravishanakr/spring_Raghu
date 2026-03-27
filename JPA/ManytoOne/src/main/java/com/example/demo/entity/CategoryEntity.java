package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CategoryEntity {

	@Id
	private Integer categoryId;
	private String CategoryName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private List<ProductEntity> products;

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

}
