package com.spring.springmvc.SpringAOP.Impl;

import org.springframework.stereotype.Component;

import com.spring.springmvc.SpringAOP.Interface.ProductService;

@Component("productserviceimpl")
public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1*num2;
		return res;
	}

}
