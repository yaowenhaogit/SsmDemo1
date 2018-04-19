package com.atguigu.crud.util;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

import com.atguigu.crud.bean.Role;
import com.atguigu.crud.bean.TblEmp;
import com.atguigu.crud.service.ITblEmpService;

public class Test {
	
	public static void main(String[] args) {
		
		Role role = new Role();
		
		Role role2 = new Role();
		
		role.setRoleCode("aa");
		role.setRoleName("bb");
		
		role2.setRoleCode("aa");
		role2.setRoleName("bb");
		
		System.out.println(role.getRoleCode()==role2.getRoleCode()
				);
	}
}
