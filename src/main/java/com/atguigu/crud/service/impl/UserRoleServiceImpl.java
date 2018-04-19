package com.atguigu.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.UserRole;
import com.atguigu.crud.dao.UserRoleMapper;
import com.atguigu.crud.service.IUserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements IUserRoleService{

	@Autowired
	UserRoleMapper userRoleDao;
	
	@Override
	public int insert(UserRole entity) {
		return userRoleDao.insert(entity);
	}

	@Override
	public int update(UserRole entity) {
		// TODO Auto-generated method stub
		return userRoleDao.update(entity);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return userRoleDao.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteBySelective(UserRole entity) {
		// TODO Auto-generated method stub
		return userRoleDao.deleteBySelective(entity);
	}

	@Override
	public UserRole findById(Long id) {
		// TODO Auto-generated method stub
		return userRoleDao.findById(id);
	}

	@Override
	public List<UserRole> findBySelective(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userRoleDao.findBySelective(map);
	}

	@Override
	public int findBySelectiveCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userRoleDao.findBySelectiveCount(map);
	}

}
