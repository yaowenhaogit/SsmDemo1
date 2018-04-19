package com.atguigu.crud.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Role;
import com.atguigu.crud.dao.RoleMapper;
import com.atguigu.crud.service.IRoleService;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {

	@Autowired
	RoleMapper roleDao;
	
	@Override
	public int insert(Role entity) {
		// TODO Auto-generated method stub
		return roleDao.insert(entity);
	}

	@Override
	public int update(Role entity) {
		// TODO Auto-generated method stub
		return roleDao.update(entity);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return roleDao.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteBySelective(Role entity) {
		// TODO Auto-generated method stub
		return roleDao.deleteBySelective(entity);
	}

	@Override
	public Role findById(Long id) {
		// TODO Auto-generated method stub
		return roleDao.findById(id);
	}

	@Override
	public List<Role> findBySelective(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return roleDao.findBySelective(map);
	}

	@Override
	public int findBySelectiveCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return roleDao.findBySelectiveCount(map);
	}

	@Override
	public void deleteAll() {
		roleDao.deleteAll();
		
	}

}
