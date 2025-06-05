package com.demo.dao;

import java.util.List;

import javax.validation.Valid;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> findAllProduct();

	void insertProduct(@Valid Product product);

	void removeById(int pid);

	Product findById(int pid);

	void modifyProduct(@Valid Product product);

}
