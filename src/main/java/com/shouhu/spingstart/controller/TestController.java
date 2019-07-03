package com.shouhu.spingstart.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shouhu.spingstart.pojo.IMoocJSONResult;
import com.shouhu.spingstart.pojo.User;

@RestController
@RequestMapping("/user")
public class TestController {
	
	@RequestMapping("/getUser")
	public User getUser() {
		
		User u = new User();
		u.setName("User");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("User");
		u.setDesc("hello User~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setName("imoosc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc~~hello imooc~~");
		
		return IMoocJSONResult.ok(u);
	}
	

}
