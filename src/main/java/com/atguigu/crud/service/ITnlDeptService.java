package com.atguigu.crud.service;

import java.util.List;
import java.util.Map;

import com.atguigu.crud.bean.TnlDept;

public interface ITnlDeptService {

	public int insert(TnlDept entity);
	
   	public int update(TnlDept entity);
   	
   	public int deleteById(Long id); 
   	
	public int deleteBySelective(TnlDept entity);
	
	public TnlDept findById(Long id);
	 
	public List<TnlDept> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map);
}
