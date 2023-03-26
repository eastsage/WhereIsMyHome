package com.ssafy.home.dao;

import com.ssafy.home.util.DBUtil;
import com.ssafy.home.vo.DongCode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DongCodeDAOImpl implements DongCodeDAO {

    private DBUtil util;

    public DongCodeDAOImpl(){
        this.util = DBUtil.getInstance();
    }

    @Override
    public DongCode getInfoByDongCode(String dongCode) {
       DongCode dongCodeInfo = null;
        try {
           Connection connection = util.getConnection();
           String query = "select * from dongcode where dongCode = ?";
           PreparedStatement preparedStatement = connection.prepareStatement(query);
           preparedStatement.setString(1, dongCode);
           ResultSet resultSet = preparedStatement.executeQuery();

           if (resultSet.next()){
               String sidoName = resultSet.getString(1);
               String gugunName= resultSet.getString(2);
               String dongName = resultSet.getString(3);
           }

           resultSet.close();
           preparedStatement.close();
           connection.close();
       } catch (Exception e){
           e.printStackTrace();
       }
       return dongCodeInfo;
    }

    @Override
    public String getDongCode(String sidoName, String gugunName, String dongName) {
        String dongCode = "";
        try {
            Connection connection = util.getConnection();
            if (sidoName.equals("시도선택")) sidoName = "%";
            if (gugunName.equals("시도선택")) gugunName = "%";
            if (dongName.equals("시도선택")) dongName= "%";

            String query = "select dongCode from dongcode where sidoName like ?" + "and gugunName like ?" + "and dongName like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, sidoName);
            preparedStatement.setString(2, gugunName);
            preparedStatement.setString(3, dongName);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
               dongCode = resultSet.getString(1);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return dongCode;
    }
}
