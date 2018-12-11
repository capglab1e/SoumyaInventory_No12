package com.cg.capstore.service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapStoreDao;
import com.cg.capstore.dto.Inventory;

@Service("productservice")
@Transactional
public class CapStoreServiceImpl implements ICapStoreService{
	
	@Autowired
	ICapStoreDao projectdao;
	
	@Override
	public List<Inventory> getProductList() {
		// TODO Auto-generated method stub
		return projectdao.getProductList();
	}

	@Override
	public void addProducts(Inventory inventory) {
		// TODO Auto-generated method stub
		projectdao.addProducts(inventory);
	}

	@Override
	public Inventory updateProducts(Inventory in) {
		// TODO Auto-generated method stub
		return projectdao.updateProducts(in);
	}

	@Override
	public List<Inventory> deleteProducts(String Product_id) {
		// TODO Auto-generated method stub
		return projectdao.deleteProducts(Product_id);
	}

	@Override
	public Inventory getProductDetails(String product_id) {
		// TODO Auto-generated method stub
		return projectdao.getProductDetails(product_id);
	}

}
