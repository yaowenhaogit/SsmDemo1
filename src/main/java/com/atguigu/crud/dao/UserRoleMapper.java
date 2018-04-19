package com.atguigu.crud.dao;

/**
 * UserRoleMapper
 */
import java.util.List;
import java.util.Map;

import  com.atguigu.crud.bean.UserRole;
 

public interface UserRoleMapper{

	public int insert(UserRole entity);
	
   	public int update(UserRole entity);
   	
   	public int deleteByPrimaryKey(Long id); 
   	
	public int deleteBySelective(UserRole entity);
	
	public UserRole findById(Long id);
	 
	public List<UserRole> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
