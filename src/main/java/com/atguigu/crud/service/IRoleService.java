package com.atguigu.crud.service;

/**
 * RoleMapper
 */
import java.util.List;
import java.util.Map;

import  com.atguigu.crud.bean.Role;
 

public interface IRoleService{

	public int insert(Role entity);
	
   	public int update(Role entity);
   	
   	public int deleteById(Long id); 
   	
	public int deleteBySelective(Role entity);
	
	public Role findById(Long id);
	 
	public List<Role> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
	
	public void deleteAll() ;
}
