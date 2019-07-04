package com.shouhu.spingstart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shouhu.spingstart.mapper.ProductMapper;
import com.shouhu.spingstart.mapper.TbUserMapper;
import com.shouhu.spingstart.pojo.Product;
import com.shouhu.spingstart.pojo.TbUser;
import com.shouhu.spingstart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private TbUserMapper userMapper;
	
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
	public void saveProduct(TbUser user) throws Exception {
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		userMapper.insert(user);
	}
//
//	@Override
//	public void updateProduct(Product user) {
//		// TODO Auto-generated method stub
//		userMapper.insert(user);
//	}
//
//	@Override
//	public void deleteProduct(String userId) {
//		// TODO Auto-generated method stub
//		userMapper.deleteByPrimaryKey(userId);
//	}
//
//	@Override
//	public Product queryProductById(String userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Product> queryProductList(Product user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Product> queryProductListPaged(Product user, Integer page, Integer pageSize) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Product queryProductByIdCustom(String userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void saveProductTransactional(Product user) {
//		// TODO Auto-generated method stub
//		
//	}

}
