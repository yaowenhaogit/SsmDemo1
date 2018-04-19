package com.atguigu.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.UserSecond;
import com.atguigu.crud.dao.UserSecondMapper;
import com.atguigu.crud.service.IUserSecondService;

@Service("userSecondService")
public class UserSecondServiceImpl implements IUserSecondService {

	@Autowired
	UserSecondMapper userSecondDao;
	
	@Override
	public int insert(UserSecond entity) {
		// TODO Auto-generated method stub
		return userSecondDao.insert(entity);
	}

	@Override
	public int update(UserSecond entity) {
		// TODO Auto-generated method stub
		return userSecondDao.update(entity);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return userSecondDao.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteBySelective(UserSecond entity) {
		// TODO Auto-generated method stub
		return userSecondDao.deleteBySelective(entity);
	}

	@Override
	public UserSecond findById(Long id) {
		// TODO Auto-generated method stub
		return userSecondDao.findById(id);
	}

	@Override
	public List<UserSecond> findBySelective(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userSecondDao.findBySelective(map);
	}

	@Override
	public int findBySelectiveCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userSecondDao.findBySelectiveCount(map);
	}

}
