package com.atguigu.crud.service;

import java.util.List;
import java.util.Map;

import com.atguigu.crud.bean.UserSecond;

public interface IUserSecondService {
	public int insert(UserSecond entity);
	
   	public int update(UserSecond entity);
   	
   	public int deleteById(Long id); 
   	
	public int deleteBySelective(UserSecond entity);
	
	public UserSecond findById(Long id);
	 
	public List<UserSecond> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
