package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.dto.Inventory;

public interface ICapStoreService {
	
	public List<Inventory> getProductList();
	public void addProducts(Inventory inventory);
	public Inventory updateProducts(Inventory in);
	public List<Inventory> deleteProducts(String Product_id);
	public Inventory getProductDetails(String product_id);
}
