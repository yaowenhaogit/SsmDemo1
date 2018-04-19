package com.atguigu.crud.dao;

/**
 * UserMapper
 */
import java.util.List;
import java.util.Map;

import  com.atguigu.crud.bean.User;
 

public interface UserMapper{

	public int insert(User entity);
	
   	public int update(User entity);
   	
   	public int deleteByPrimaryKey(Long id); 
   	
	public int deleteBySelective(User entity);
	
	public User findById(Long id);
	 
	public List<User> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
