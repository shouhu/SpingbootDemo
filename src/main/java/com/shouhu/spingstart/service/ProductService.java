package com.shouhu.spingstart.service;

import java.util.List;

import com.shouhu.spingstart.pojo.Product;
import com.shouhu.spingstart.pojo.TbProduct;
import com.shouhu.spingstart.pojo.TbUser;

public interface ProductService {
	
	public void saveProduct(TbProduct product) throws Exception;

	public void updateProduct(TbProduct product);

	public void deleteProduct(String productId);

	public TbProduct queryProductById(String productId);
//
//	public List<Product> queryProductList(Product user);
//
	public List<TbProduct> queryProductListPaged( Integer page, Integer pageSize);
//
	public TbProduct queryProductSimplyInfoById(String pid);
//	
	public void saveProductTransactional(TbProduct product);

}
