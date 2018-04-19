package com.atguigu.crud.shiro.realms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.crud.bean.User;
import com.atguigu.crud.bean.UserSecond;
import com.atguigu.crud.service.IUserSecondService;
import com.atguigu.crud.service.IUserService;

public class SecondRealm extends AuthenticatingRealm{

	@Autowired
	IUserSecondService userSecondService;
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken uptoken = (UsernamePasswordToken) token;
		//从userpasswordToken中获取username；
		String username = uptoken.getUsername();
		//调用数庫的方法，从数据库中查询username对应的用户记录
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		List<UserSecond> list = userSecondService.findBySelective(map);
		
		//若用户不存在，则抛出异常
		if (list.size()<=0) {
			throw new UnknownAccountException("用户不存在");
		}
		//用户被锁定
		if ("monster".equals(username)) {
			throw new LockedAccountException("用户被锁定");
		} 
		
		//根据用户的情况，来构建authenticationInfo 对象并返回；
		Object principal = username;
		
		Object credentials = list.get(0).getPassword(); //"fc1709d0a95a6be30bc5926fdb7f22f4";
//		if("admin".equals(username)){
//			credentials = "038bdaf98f2037b31f1e75b5b4c9b26e";
//		}else if("user".equals(username)){
//			credentials = "098d2c478e9c11555ce2823231e02ec1";
//		}
		String realmName = getName();
		
		//盐值
		ByteSource credentialsSalt = ByteSource.Util.bytes(username);
		
		SimpleAuthenticationInfo info;// = new SimpleAuthenticationInfo(principal, credentials, realmName);
		info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
		return info;
	}
}
