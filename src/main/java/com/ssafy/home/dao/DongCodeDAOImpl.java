package com.ssafy.home.dao;

import com.ssafy.home.util.DBUtil;
import com.ssafy.home.vo.DongCode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
           if (dongCode == null) dongCode = "%";
           String query = "select * from dongcode where dongCode like ?";
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
            if (sidoName == null) sidoName = "%";
            if (gugunName == null) gugunName = "%";
            if (dongName == null) dongName= "%";

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

    @Override
    public ArrayList<String> getSidos(){
        ArrayList<String> sidos= new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            String query = "select distinct sidoName from dongcode";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                String sido= resultSet.getString(1);
                sidos.add(sido);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return sidos;
    }

    @Override
    public ArrayList<String> getGuguns(String sido) {
        ArrayList<String> gungus = new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            if (sido == null) sido = "%";
            String query = "select distinct gugunName from dongcode where sidoName like ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, sido);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                String gunguName = resultSet.getString(1);
                gungus.add(gunguName);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        return gungus;
    }

    @Override
    public ArrayList<String> getDongs(String sido, String gugun) {
        ArrayList<String> dongs = new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            if (sido == null) sido = "%";
            else if (gugun == null) gugun= "%";

            String query = "select distinct dongName from dongcode where sidoName like ? and gugunName like ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, sido);
            statement.setString(2, gugun);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                String dongName = resultSet.getString(1);
                dongs.add(dongName);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return dongs;
    }
}
