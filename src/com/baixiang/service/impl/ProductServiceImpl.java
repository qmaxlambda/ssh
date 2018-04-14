package com.baixiang.service.impl;

import java.util.List;

import com.baixiang.dao.ProductDAO;
import com.baixiang.pojo.Product;
import com.baixiang.service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDAO productDAO;
	public ProductDAO getProductDAO() {
		return productDAO;
	}
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	public List<Product> list() {
		List<Product> products = productDAO.list();
		// TODO Auto-generated method stub
	if (products.isEmpty()) {
		for (int i = 0; i < 5; i++) {
			Product p = new Product();
			p.setName("product"+i);
			productDAO.add(p);
			products.add(p);
		}
		
		
	}
	return products;
	}

	
}
