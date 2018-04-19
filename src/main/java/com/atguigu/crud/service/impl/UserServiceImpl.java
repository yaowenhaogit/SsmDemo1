package com.atguigu.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.User;
import com.atguigu.crud.dao.UserMapper;
import com.atguigu.crud.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserMapper userDao;
	
	@Override
	public int insert(User entity) {
		// TODO Auto-generated method stub
		return userDao.insert(entity);
	}

	@Override
	public int update(User entity) {
		// TODO Auto-generated method stub
		return userDao.update(entity);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return userDao.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteBySelective(User entity) {
		// TODO Auto-generated method stub
		return userDao.deleteBySelective(entity);
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public List<User> findBySelective(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.findBySelective(map);
	}

	@Override
	public int findBySelectiveCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.findBySelectiveCount(map);
	}

}
