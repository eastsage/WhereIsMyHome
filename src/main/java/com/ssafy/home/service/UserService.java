package com.ssafy.home.service;


import com.ssafy.home.vo.User;

public interface UserService {
	boolean check(User user);

	int modify(User oldUser, User newUser);

    int search(String id);

	int delete(String id);

	String findPass(String id);

	int signupProcess(User user);
}
