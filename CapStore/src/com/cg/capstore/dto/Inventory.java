package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
	
	@Column(name = "product_name")
	String product_name;
	@Id
	@Column(name = "product_id")
	String product_id;	
	@Column(name = "category_id")
	String category_id;
	@Column(name = "merchant_user_id")
	String merchant_id;
	@Column(name = "product_price")
	Float price;
	@Column(name = "product_quantity")
	Integer quantity;
	@Column(name = "subcategory_id")
	String subcategory_id;
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(String subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public Inventory(String product_name, String product_id,
			String category_id, String merchant_id, Float price,
			Integer quantity, String subcategory_id) {
		super();
		this.product_name = product_name;
		this.product_id = product_id;
		this.category_id = category_id;
		this.merchant_id = merchant_id;
		this.price = price;
		this.quantity = quantity;
		this.subcategory_id = subcategory_id;
	}

	
	
}
