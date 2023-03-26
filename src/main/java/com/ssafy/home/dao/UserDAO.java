package com.ssafy.home.dao;


import com.ssafy.home.vo.User;

public interface UserDAO {

	boolean check(User user);

	int modify(User oldUser, User newUser);

	int search(String id);
}
