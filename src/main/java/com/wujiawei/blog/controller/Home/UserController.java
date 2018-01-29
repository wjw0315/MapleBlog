package com.wujiawei.blog.controller.Home;

import com.wujiawei.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;


import com.wujiawei.blog.util.Functions;
/**
 * 用户的controller
 * Created by wjw
 */
@Controller
public class UserController {

	@Autowired
	private  HttpServletRequest request;

	@Autowired
	private UserService userService;

	@Autowired
	private Functions functions;








}
