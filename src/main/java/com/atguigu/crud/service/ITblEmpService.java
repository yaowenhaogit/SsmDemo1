package com.atguigu.crud.service;

import java.util.List;
import java.util.Map;

import com.atguigu.crud.bean.TblEmp;

public interface ITblEmpService {
	public int insert(TblEmp entity);
	
   	public int update(TblEmp entity);
   	
   	public int deleteById(Long id); 
   	
	public int deleteBySelective(TblEmp entity);
	
	public TblEmp findById(Long id);
	 
	public List<TblEmp> findBySelective(Map<String, Object> map);
	
	public int findBySelectiveCount(Map<String, Object> map); 
}
