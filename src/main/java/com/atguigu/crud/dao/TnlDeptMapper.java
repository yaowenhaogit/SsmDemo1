package com.atguigu.crud.dao;


/**
 * TnlDeptMapper
 */
import java.util.List;
import java.util.Map;

import com.atguigu.crud.bean.TnlDept;

public interface TnlDeptMapper{

	public int insert(TnlDept entity);
	
   	public int update(TnlDept entity);
   	
   	public int deleteByPrimaryKey(Long id); 
   	
	public int deleteBySelective(TnlDept entity);
	
	public TnlDept findById(Long id);
	 
	public List<TnlDept> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
