package com.aasoapexample;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.aasoapexample.model.Product;
import com.aasoapexample.service.ProductCatelogService;

@WebService(endpointInterface="com.aasoapexample.ProductCatelog",portName="ProCatalogPort",
serviceName="ProCatelogService")
public class ProductCatelogImpl implements ProductCatelog {
	
	ProductCatelogService pc = new ProductCatelogService();
	//@WebMethod(action="fetch_categories",operationName="fetch categories")
	/* (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#getAllProduct()
	 */
	@Override
	
	public List<String> getAllProduct()
	{
		return pc.getProductCaategories();
	}
	/* (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#getProduct(java.lang.String)
	 */
	@Override
	
	public List<String> getProduct(String category)
	{
		return pc.getProduct(category);
	}
	/* (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	
	public boolean addProduct(String category,String product)
	{
		return pc.addProduct(category,product);
	}
	
	/* (non-Javadoc)
	 * @see com.aasoapexample.ProductCatelog#getProductModel(com.aasoapexample.model.Product)
	 */
	@Override
	
	public List<Product> getProductModel(Product product)
	{
		return pc.getProductMoserv(product);
	}
}
