package com.atguigu.crud.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/shiro")
public class ShiroLoginController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ShiroLoginController.class);

	@RequestMapping(value = "/login.do", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String login(@RequestParam("username") String username,@RequestParam("password") String password) {
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username,password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				LOGGER.debug("登陆失败： "+e.getMessage());
				return "{\"r\":\"用户名或密码错误\"}";
			}
			
		}
		return "{\"r\":\"ok\"}";
	}
}
