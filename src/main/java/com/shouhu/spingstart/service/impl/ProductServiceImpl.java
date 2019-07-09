package com.shouhu.spingstart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.shouhu.spingstart.mapper.ProductMapper;
import com.shouhu.spingstart.mapper.SysProductMapperCustom;
import com.shouhu.spingstart.mapper.TbProductMapper;
import com.shouhu.spingstart.mapper.TbUserMapper;
import com.shouhu.spingstart.pojo.Product;
import com.shouhu.spingstart.pojo.TbProduct;
import com.shouhu.spingstart.pojo.TbUser;
import com.shouhu.spingstart.service.ProductService;

import tk.mybatis.mapper.entity.Example;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private TbProductMapper userMapper;
	
	@Autowired
	private SysProductMapperCustom productMapperCustom;
	

	@Override
	public TbProduct queryProductSimplyInfoById(String pid) {
		// TODO Auto-generated method stub
		List<TbProduct> products = productMapperCustom.queryProductSimplyInfoById(pid);
		
		if(products!=null && products.size()>0) {
	         return products.get(0);
		}
		return null;
	}
	
	

	@Override
	public void saveProduct(TbProduct product) throws Exception {
		// TODO Auto-generated method stub
		userMapper.insert(product);
	}

	@Override
	public void updateProduct(TbProduct product) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public void deleteProduct(String productId) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(productId);
	}

	@Override
	public TbProduct queryProductById(String productId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(productId);
	}

	@Override
	public List<TbProduct> queryProductListPaged(Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		// 开始分页
        PageHelper.startPage(page, pageSize);
		
		Example example = new Example(TbProduct.class);
		Example.Criteria criteria = example.createCriteria();
		example.orderBy("pid");
		List<TbProduct> userList = userMapper.selectByExample(example);
		return userList;
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveProductTransactional(TbProduct product) {
		// TODO Auto-generated method stub
	    userMapper.insert(product);
		
		//int a = 1 / 0;
		
		product.setIsdelete(1);
		userMapper.updateByPrimaryKeySelective(product);
	}

	


}
