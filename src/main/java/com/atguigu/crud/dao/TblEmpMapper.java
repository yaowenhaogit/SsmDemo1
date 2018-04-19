package com.atguigu.crud.dao;

/**
 * TblEmpMapper
 */
import java.util.List;
import java.util.Map;

import com.atguigu.crud.bean.TblEmp;

 

public interface TblEmpMapper{

	public int insert(TblEmp entity);
	
   	public int update(TblEmp entity);
   	
   	public int deleteByPrimaryKey(Long id); 
   	
	public int deleteBySelective(TblEmp entity);
	
	public TblEmp findById(Long id);
	 
	public List<TblEmp> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
