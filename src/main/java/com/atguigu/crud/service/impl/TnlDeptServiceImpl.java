package com.atguigu.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.TnlDept;
import com.atguigu.crud.dao.TnlDeptMapper;
import com.atguigu.crud.service.ITnlDeptService;

@Service("tnlDeptService")
public class TnlDeptServiceImpl implements ITnlDeptService {
	@Autowired
	TnlDeptMapper tnlDeptDao;
	
	@Override
	public int insert(TnlDept entity) {
		// TODO Auto-generated method stub
		return tnlDeptDao.insert(entity);
	}

	@Override
	public int update(TnlDept entity) {
		// TODO Auto-generated method stub
		return tnlDeptDao.update(entity);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return tnlDeptDao.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteBySelective(TnlDept entity) {
		// TODO Auto-generated method stub
		return tnlDeptDao.deleteBySelective(entity);
	}

	@Override
	public TnlDept findById(Long id) {
		// TODO Auto-generated method stub
		return tnlDeptDao.findById(id);
	}

	@Override
	public List<TnlDept> findBySelective(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tnlDeptDao.findBySelective(map);
	}

	@Override
	public int findBySelectiveCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tnlDeptDao.findBySelectiveCount(map);
	}
	
	
}
