package com.shouhu.spingstart.controller;


import java.util.Date;
import java.util.List;
import java.util.Random;

import org.n3r.idworker.Sid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shouhu.spingstart.mapper.TbUserMapper;
import com.shouhu.spingstart.pojo.IMoocJSONResult;
import com.shouhu.spingstart.pojo.Product;
import com.shouhu.spingstart.pojo.TbProduct;
import com.shouhu.spingstart.pojo.TbUser;
import com.shouhu.spingstart.service.ProductService;



@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {
	
	@Autowired
	private ProductService productService;
	

	
	
	
	@Autowired
	private Sid sid;
	
	@RequestMapping("/saveProduct")
	public IMoocJSONResult saveProduct() throws Exception {
		
		String userId = sid.nextShort();
		
		TbProduct user = new TbProduct();
		user.setPid(userId);
		user.setPdesc("zxc"+new Random().nextInt()+"" );
		user.setPimage("123456"+new Random().nextInt()+"" );
		productService.saveProduct(user);
		
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/queryUserListPaged")
	public IMoocJSONResult queryUserListPaged(Integer page) {
		
		//http://localhost:8080/mybatis/queryUserListPaged?page=3
		if (page == null) {
			page = 1;
		}

		int pageSize = 10;
		
		//TbProduct user = new TbProduct();
//		user.setNickname("lee");
		
		List<TbProduct> userList = productService.queryProductListPaged( page, pageSize);
		
		return IMoocJSONResult.ok(userList);
	}
	
	@RequestMapping("/queryProductSimplyInfoById")
	public IMoocJSONResult queryProductSimplyInfoById(String pid) {

		
		TbProduct userList = productService.queryProductSimplyInfoById(pid);
		
		return IMoocJSONResult.ok(userList);
	}
	
	
	@RequestMapping("/saveUserTransactional")
	public IMoocJSONResult saveUserTransactional() {
		
		String userId = sid.nextShort();
		
		TbProduct user = new TbProduct();
		user.setPid(userId);
		user.setPdesc("zxc"+new Random().nextInt()+"" );
		user.setPimage("123456"+new Random().nextInt()+"" );
		
		productService.saveProductTransactional(user);
		
		return IMoocJSONResult.ok("保存成功");
	}
	
	
//	@RequestMapping("/updateUser")
//	public IMoocJSONResult updateUser() {
//		
//		TbUser user = new TbUser();
//		user.setUid("190704GFG02K9680");
//		user.setPassword("zxcs" );
//		user.setName("123456ssss" );
//		user.setTelephone("assssbc123");	
//		
//		productService.updateProduct(user);
//		
//		return IMoocJSONResult.ok("保存成功");
//	}
////	
//	@RequestMapping("/deleteUser")
//	public IMoocJSONResult deleteUser(String userId) {
//		
//		productService.deleteProduct("190704GMCCD720DP");
//		
//		return IMoocJSONResult.ok("删除成功");
//	}
//	
//	@RequestMapping("/queryUserById")
//	public IMoocJSONResult queryUserById(String userId) {
//		
//		return IMoocJSONResult.ok(userService.queryUserById(userId));
//	}
//	
//	@RequestMapping("/queryUserList")
//	public IMoocJSONResult queryUserList() {
//		
//		SysUser user = new SysUser();
//		user.setUsername("imooc");
//		user.setNickname("lee");
//		
//		List<SysUser> userList = userService.queryUserList(user);
//		
//		return IMoocJSONResult.ok(userList);
//	}
//	
//	@RequestMapping("/queryUserListPaged")
//	public IMoocJSONResult queryUserListPaged(Integer page) {
//		
//		if (page == null) {
//			page = 1;
//		}
//
//		int pageSize = 10;
//		
//		SysUser user = new SysUser();
////		user.setNickname("lee");
//		
//		List<SysUser> userList = userService.queryUserListPaged(user, page, pageSize);
//		
//		return IMoocJSONResult.ok(userList);
//	}
//	
//	@RequestMapping("/queryUserByIdCustom")
//	public IMoocJSONResult queryUserByIdCustom(String userId) {
//		
//		return IMoocJSONResult.ok(userService.queryUserByIdCustom(userId));
//	}
//	
//	@RequestMapping("/saveUserTransactional")
//	public IMoocJSONResult saveUserTransactional() {
//		
//		String userId = sid.nextShort();
//		
//		SysUser user = new SysUser();
//		user.setId(userId);
//		user.setUsername("lee" + new Date());
//		user.setNickname("lee" + new Date());
//		user.setPassword("abc123");
//		user.setIsDelete(0);
//		user.setRegistTime(new Date());
//		
//		userService.saveUserTransactional(user);
//		
//		return IMoocJSONResult.ok("保存成功");
//	}
}
