package com.baixiang.dao;

import java.util.List;

import com.baixiang.pojo.Product;

public interface ProductDAO {
	public List<Product> list();
	public void add(Product p);
}
