package com.aasoapexample;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.aasoapexample.model.Product;
@WebService(name="ProCatalog",targetNamespace="http://www.ProCatns.com")
public interface ProductCatelog {

	@WebMethod
	List<String> getAllProduct();
	//@WebMethod(action="fetch_categories",operationName="fetch categories")
	@WebMethod
	List<String> getProduct(String category);
	@WebMethod
	boolean addProduct(String category, String product);
	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductModel(Product product);

}