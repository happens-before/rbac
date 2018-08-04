package com.xupt.edu.rbac.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, String name, String password) {
		//1.获取当前的Subject，调用SecurityUtils.getSubject();
		Subject subject = SecurityUtils.getSubject();
		//2.把用户名和密码封装为UsernamePasswordToken对象
		UsernamePasswordToken token = new UsernamePasswordToken(name, password);
		try {
			//3.执行登陆
			subject.login(token);
			Session session = subject.getSession();
			session.setAttribute("subject", subject);
			return "redirect:index";

		} catch (AuthenticationException e) {
			model.addAttribute("error", "验证失败");
			return "login";
		}
	}

}
