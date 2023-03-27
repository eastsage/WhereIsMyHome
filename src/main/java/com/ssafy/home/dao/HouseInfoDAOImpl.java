package com.ssafy.home.dao;

import com.ssafy.home.util.DBUtil;
import com.ssafy.home.vo.HouseInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HouseInfoDAOImpl implements HouseInfoDAO{

    private DBUtil util;

    public HouseInfoDAOImpl(){
        this.util = DBUtil.getInstance();
    }

    @Override
    public HouseInfo searchByAptCode(String aptCode) {
       HouseInfo info = null;
       try {
           Connection connection = util.getConnection();
           String query = "select * from houseinfo where aptCode = ?";
           PreparedStatement preparedStatement = connection.prepareStatement(query);
           preparedStatement.setString(1, aptCode);
           ResultSet resultSet = preparedStatement.executeQuery();

           if (resultSet.next()){
               String buildYear = resultSet.getString(2);
               String roadName = resultSet.getString(3);
               String roadNameBonBun = resultSet.getString(4);
               String roadNameBubun = resultSet.getString(5);
               String roadNameSeq = resultSet.getString(6);
               String roadNameBasementCode = resultSet.getString(7);
               String roadNameCode = resultSet.getString(8);
               String dong = resultSet.getString(9);
               String bonbun = resultSet.getString(10);
               String bubun = resultSet.getString(11);
               String sigunguCode = resultSet.getString(12);
               String eubmyundongCode = resultSet.getString(13);
               String dongCode = resultSet.getString(14);
               String landCode = resultSet.getString(15);
               String apartmentName = resultSet.getString(16);
               String jibun = resultSet.getString(17);
               String lng = resultSet.getString(18);
               String lat = resultSet.getString(19);

               info = new HouseInfo(aptCode, buildYear, roadName, roadNameBonBun, roadNameBubun,
                                    roadNameSeq, roadNameBasementCode, roadNameCode, dong,
                                    bonbun, bubun, sigunguCode, eubmyundongCode, dongCode, landCode,
                                    apartmentName, jibun, lng, lat);
           }

           resultSet.close();
           preparedStatement.close();
           connection.close();
       } catch (Exception e){
            e.printStackTrace();
       }

       return info;
    }
    @Override
    public ArrayList<String> getAptCodes(String dongCode){
        ArrayList<String> aptCodes = new ArrayList<>();
        try {
           Connection connection = util.getConnection();
           String query = "select aptCode from houseinfo where dongCode = ?";
           PreparedStatement preparedStatement = connection.prepareStatement(query);
           preparedStatement.setString(1, dongCode);
           ResultSet resultSet = preparedStatement.executeQuery();

           if (resultSet.next()){
                String aptCode = resultSet.getString(1);
                aptCodes.add(aptCode);
           }

           resultSet.close();
           preparedStatement.close();
           connection.close();
       } catch (Exception e){
            e.printStackTrace();
       }

        return aptCodes;
    }
}
