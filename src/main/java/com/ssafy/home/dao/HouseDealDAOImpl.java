package com.ssafy.home.dao;

import com.ssafy.home.util.DBUtil;
import com.ssafy.home.vo.HouseDeal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class HouseDealDAOImpl implements HouseDealDAO{

    private DBUtil util;
    public HouseDealDAOImpl(){
        this.util = DBUtil.getInstance();
    }

    @Override
    public ArrayList<HouseDeal> select(ArrayList<String> aptCodes, String dealYear, String dealMonth) {
        ArrayList<HouseDeal> list = new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            String query = "select 'no', dealAmount, dealDay, area, floor, cancelDealType from housedeal where aptCode = ? and dealYear = ? and dealMonth = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            for (String aptCode : aptCodes) {
                preparedStatement.setString(1, aptCode);
                preparedStatement.setString(2, dealYear);
                preparedStatement.setString(3, dealMonth);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String no = resultSet.getString(1);
                    String dealAmount = resultSet.getString(2);
                    String dealDay = resultSet.getString(3);
                    String area = resultSet.getString(4);
                    String floor = resultSet.getString(5);
                    String cancelDealType = resultSet.getString(6);

                    HouseDeal deal = new HouseDeal(no, dealAmount, dealYear, dealMonth, dealDay,
                        area, floor,
                        cancelDealType, aptCode);
                    list.add(deal);
                }
                resultSet.close();
                preparedStatement.close();
            }
            list = new ArrayList<>(
              list.stream().distinct().collect(Collectors.toList())
            );

            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> getDealYear(ArrayList<String> aptCodes){
        ArrayList<String> list = new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            String query = "select dealYear from housedeal where  aptCode= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            for (String aptCode : aptCodes) {

                preparedStatement.setString(1, aptCode);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String dealYear = resultSet.getString(1);
                    list.add(dealYear);
                }
                resultSet.close();
            }
            list = new ArrayList<>(
                list.stream().distinct().collect(Collectors.toList())
            );
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<String> getDealMonth(ArrayList<String> aptCodes, String dealYear) {
        ArrayList<String> list = new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            String query = "select dealMonth from housedeal where aptCode= ? and dealYear = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(2, dealYear);

            for (String aptCode : aptCodes){
                preparedStatement.setString(1, aptCode);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String dealMonth = resultSet.getString(1);
                    list.add(dealMonth);
                }
                resultSet.close();
            }
            list = new ArrayList<>(
                list.stream().distinct().collect(Collectors.toList())
            );
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
