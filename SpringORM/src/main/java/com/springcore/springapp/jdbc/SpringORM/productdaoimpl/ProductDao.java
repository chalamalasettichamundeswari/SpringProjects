package com.springcore.springapp.jdbc.SpringORM.productdaoimpl;

import java.util.List;

import com.springcore.springapp.jdbc.SpringORM.entity.Product;

public interface ProductDao {
	 int create(Product product);
	 void update(Product product);
	 void delete(Product product);
	 Product find(int id);
	 List<Product>findAll();
}
