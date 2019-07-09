package com.shouhu.spingstart.mapper;


import java.util.List;


import com.shouhu.spingstart.pojo.TbProduct;

public interface SysProductMapperCustom {
	
	List<TbProduct> queryProductSimplyInfoById(String pid);
}