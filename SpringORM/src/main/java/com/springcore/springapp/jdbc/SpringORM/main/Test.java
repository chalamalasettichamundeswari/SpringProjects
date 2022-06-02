package com.springcore.springapp.jdbc.SpringORM.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springapp.jdbc.SpringORM.entity.Product;
import com.springcore.springapp.jdbc.SpringORM.productdaoimpl.ProductDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/springapp/jdbc/SpringORM/main/config.xml");
      ProductDao proddao =(ProductDao)ac.getBean("proddaoimpl");
      Product prod =new Product();
      prod.setId(6);
      prod.setName("soap");
      prod.setDesc("Good product");
      prod.setPrice(100);
      proddao.create(prod);
      
      proddao.update(prod);
      proddao.delete(prod);
    // Product prod= proddao.find(1);
     System.out.println(proddao.findAll());
	}

}
