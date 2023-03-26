package com.ssafy.home.service;

import com.ssafy.home.dao.UserDAO;
import com.ssafy.home.dao.UserDAOImpl;
import com.ssafy.home.vo.User;

public class UserServiceImpl implements UserService{
	UserDAO udao;
	
	public UserServiceImpl(){
		udao = new UserDAOImpl();
	}

	@Override
	public boolean check(User user) {
		return udao.check(user);
	}

	@Override
	public int modify(User oldUser, User newUser) {
		return udao.modify(oldUser, newUser);
	}
}
