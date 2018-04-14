package com.baixiang.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.baixiang.dao.ProductDAO;
import com.baixiang.pojo.Product;

public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {

	
	public List<Product> list() {
		// TODO Auto-generated method stub
		return find("from Product");
	}
	@Override
	public void add(Product p) {
	
		save(p);
	}

}
