package com.aasoapexample.service;

import java.util.ArrayList;
import java.util.List;

import com.aasoapexample.model.Product;

public class ProductCatelogService {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();
	
	
	public ProductCatelogService() {
		bookList.add("book1");
		bookList.add("book2");
		bookList.add("book3");
		
		musicList.add("music1");
		musicList.add("music2");
		musicList.add("music3");
		
		moviesList.add("movie1");
		moviesList.add("movie2");
		moviesList.add("movie3");
	}


	public List<String> getProductCaategories()
	{
		List<String> lisStr = new ArrayList<String>();
		lisStr.add("Book");
		lisStr.add("Music");
		lisStr.add("Movies");
		return lisStr;
	}
	
	public List<String> getProduct(String name)
	{
		switch (name.toLowerCase()) {
		case "book": return bookList;
		case "movie": return moviesList;
		case "music": return musicList;
		
			
			

		}
		return bookList;
		
	}
	public boolean addProduct(String name,String product)
	{
		switch (name.toLowerCase()) {
		case "book": bookList.add(product);break;
		case "movie": moviesList.add(product);break;
		case "music": musicList.add(product);break;
		
			default:
			return false;

		}
		return true;
	}


	public List<Product> getProductMoserv(Product product) {

List<Product> lisPro = new ArrayList<>();
lisPro.add(new Product(1,"Laptop",45006.59f));
lisPro.add(new Product(2,"keyboard",769.29f));
lisPro.add(new Product(3,"Mouse",894.30f));


		
		
		return lisPro;
	}
	
}
