package com.roshan.products.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.roshan.products.pojo.Products;

public class ProductsDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addProducts(Products products){
		String sqlQuery = "insert into productsInfo values (?,?,?)";
		jdbcTemplate.update(sqlQuery, products.getProductId(), products.getProductName(), products.getPrice());
	}
	
	public void getProduct(Products products){
		String sqlQuery = "select * from productsInfo where productId = ?";
		jdbcTemplate.update(sqlQuery, products.getProductId(), products.getProductName(), products.getPrice());
	}
	
	/*public List<Products> getAllProducts(){
		String sqlQuery = "select * from productsInfo";
		return jdbcTemplate.query(sqlQuery);
	}*/
	
	public void remove(Products products){
		String sqlQuery = "delete from productsInfo where productId =?";
		jdbcTemplate.update(sqlQuery, products.getProductId());
	}
	
	public void update(Products products){
		String sqlQuery = "insert into productsInfo values (?,?,?)";
		jdbcTemplate.update(sqlQuery, products.getProductId(), products.getProductName(), products.getPrice());
	}
	
	public void contains(Products products){
		String sqlQuery = "insert into productsInfo values (?,?,?)";
		jdbcTemplate.update(sqlQuery, products.getProductId(), products.getProductName(), products.getPrice());
	}
	
}
