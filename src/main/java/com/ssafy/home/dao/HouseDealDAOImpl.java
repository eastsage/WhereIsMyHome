package com.ssafy.home.dao;

import com.ssafy.home.util.DBUtil;
import com.ssafy.home.vo.HouseDeal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class HouseDealDAOImpl implements HouseDealDAO{

    private DBUtil util;
    public HouseDealDAOImpl(){
        this.util = DBUtil.getInstance();
    }

    @Override
    public ArrayList<HouseDeal> select(String aptCode, String dealYear, String dealMonth) {
        ArrayList<HouseDeal> list = new ArrayList<>();
        try {
            Connection connection = util.getConnection();
            if (aptCode.equals("")) aptCode = "%";
            if (dealYear.equals("매매년도선택")) dealYear= "%";
            else if (dealMonth.equals("매매월선택")) dealMonth= "%";

            String query = "select 'no', dealAmount, dealDay, area, floor, cancelDealType from housedeal where apartmentName like ? and dealYear like ? and dealMonth like ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, aptCode);
            preparedStatement.setString(2, dealYear);
            preparedStatement.setString(3, dealMonth);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String no = resultSet.getString(1);
                String dealAmount = resultSet.getString(2);
                String dealDay = resultSet.getString(3);
                String area = resultSet.getString(4);
                String floor = resultSet.getString(5);
                String cancelDealType = resultSet.getString(6);

                HouseDeal deal = new HouseDeal(no, dealAmount, dealYear, dealMonth, dealDay, area, floor,
                                                cancelDealType, aptCode);
                list.add(deal);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


}
