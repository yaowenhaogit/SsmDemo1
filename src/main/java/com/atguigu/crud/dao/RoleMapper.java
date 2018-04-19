package com.atguigu.crud.dao;

/**
 * RoleMapper
 */
import java.util.List;
import java.util.Map;

import  com.atguigu.crud.bean.Role;
 

public interface RoleMapper{

	public int insert(Role entity);
	
   	public int update(Role entity);
   	
   	public int deleteByPrimaryKey(Long id); 
   	
	public int deleteBySelective(Role entity);
	
	public Role findById(Long id);
	 
	public List<Role> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
	
	public void deleteAll() ;
		
}
