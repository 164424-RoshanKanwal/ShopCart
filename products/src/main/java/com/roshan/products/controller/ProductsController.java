package com.roshan.products.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roshan.products.dao.ProductsDAO;
import com.roshan.products.pojo.Products;



public class ProductsController {

	public ProductsController() {
		
	}
public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");
		ProductsDAO productsDAO = context.getBean(ProductsDAO.class);
		productsDAO.remove();
		
		context.close();
	}
}
