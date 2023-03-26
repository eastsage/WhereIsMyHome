package com.ssafy.home.dao;

import com.ssafy.home.util.DBUtil;
import com.ssafy.home.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {
	private DBUtil util;

	public UserDAOImpl() {// 만들어진 connection pool 찾아오기
		try {
			util = DBUtil.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean check(User user) {
		boolean flag = false;
		try {
			Connection con = util.getConnection();//pool에서 한개 빌려옴
			String q = "select id from user where id = ? and pw = ?";
			PreparedStatement stat = con.prepareStatement(q);
			stat.setString(1, user.getId());
			stat.setString(2, user.getPw());
			
			ResultSet rs = stat.executeQuery();			
			
			if(rs.next()) flag = true;
			con.close();//pool에 반납
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}






