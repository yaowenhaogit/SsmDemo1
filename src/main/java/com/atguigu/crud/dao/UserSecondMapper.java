package com.atguigu.crud.dao;

/**
 * UserSecondMapper
 */
import java.util.List;
import java.util.Map;

import  com.atguigu.crud.bean.UserSecond;
 

public interface UserSecondMapper{

	public int insert(UserSecond entity);
	
   	public int update(UserSecond entity);
   	
   	public int deleteByPrimaryKey(Long id); 
   	
	public int deleteBySelective(UserSecond entity);
	
	public UserSecond findById(Long id);
	 
	public List<UserSecond> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
