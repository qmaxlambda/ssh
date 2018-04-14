package com.baixiang.action;

import com.baixiang.pojo.Product;
import com.baixiang.service.ProductService;
import java.util.List;
public class ProductAction {
	ProductService productService;
	List<Product> products;
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}


	
	public String list() {
		products = productService.list();
		return "listJsp";
	}
	
	
	
}
