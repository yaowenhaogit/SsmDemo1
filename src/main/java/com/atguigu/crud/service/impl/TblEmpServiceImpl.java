package com.atguigu.crud.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.TblEmp;
import com.atguigu.crud.dao.TblEmpMapper;
import com.atguigu.crud.service.ITblEmpService;

@Service("tblEmpService")
public class TblEmpServiceImpl implements ITblEmpService {
	
	@Autowired
	TblEmpMapper tblEmpDao;
	
	@Override
	public int insert(TblEmp entity) {
		// TODO Auto-generated method stub
		return tblEmpDao.insert(entity);
	}

	@Override
	public int update(TblEmp entity) {
		// TODO Auto-generated method stub
		return tblEmpDao.update(entity);
	}
	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return tblEmpDao.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteBySelective(TblEmp entity) {
		// TODO Auto-generated method stub
		return tblEmpDao.deleteBySelective(entity);
	}

	@Override
	public TblEmp findById(Long id) {
		// TODO Auto-generated method stub
		return tblEmpDao.findById(id);
	}

	@Override
	public List<TblEmp> findBySelective(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tblEmpDao.findBySelective(map);
	}

	@Override
	public int findBySelectiveCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tblEmpDao.findBySelectiveCount(map);
	}

}
