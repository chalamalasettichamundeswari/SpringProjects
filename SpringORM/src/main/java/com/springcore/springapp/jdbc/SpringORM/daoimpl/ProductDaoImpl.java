package com.springcore.springapp.jdbc.SpringORM.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springcore.springapp.jdbc.SpringORM.entity.Product;
import com.springcore.springapp.jdbc.SpringORM.productdaoimpl.ProductDao;


public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibertemp;
	
	@Override
	@Transactional
	public int create(Product product) {
		return (int) hibertemp.save(product);
		
	}

	@Override
	@Transactional
	public void update(Product product) {
		 hibertemp.update(product);
	
	}

	@Override
	@Transactional
	public void delete(Product product) {
		// TODO Auto-generated method stub
		 hibertemp.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		// TODO Auto-generated method stub
		return hibertemp.get(Product.class,id);
		 
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return hibertemp.loadAll(Product.class);
		
	}

}
