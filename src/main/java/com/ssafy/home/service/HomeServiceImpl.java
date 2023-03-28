package com.ssafy.home.service;

import com.ssafy.home.dao.*;
import com.ssafy.home.vo.HouseDeal;

import com.ssafy.home.vo.HouseInfo;
import java.util.ArrayList;

public class HomeServiceImpl implements HomeService {

    private DongCodeDAO dongCodeDAO;
    private HouseDealDAO houseDealDAO;
    private HouseInfoDAO houseInfoDAO;

    public HomeServiceImpl(){
        this.dongCodeDAO = new DongCodeDAOImpl();
        this.houseDealDAO= new HouseDealDAOImpl();
        this.houseInfoDAO= new HouseInfoDAOImpl();
    }
    @Override
    public ArrayList<String> getSidos() {
        return dongCodeDAO.getSidos();
    }

    @Override
    public ArrayList<String> getGuguns(String sido) {
        return dongCodeDAO.getGuguns(sido);
    }

    @Override
    public ArrayList<String> getDongs(String sido, String gugun) {
        return dongCodeDAO.getDongs(sido, gugun);
    }

    @Override
    public ArrayList<String> getDealYear(ArrayList<String> aptCodes) {
        return houseDealDAO.getDealYear(aptCodes);
    }

    @Override
    public ArrayList<String> getDealMonth(ArrayList<String> aptCodes, String dealYear) {
        return houseDealDAO.getDealMonth(aptCodes, dealYear);
    }

    @Override
    public String getDongCode(String sido, String gugun, String dong) {
        return dongCodeDAO.getDongCode(sido, gugun, dong);
    }

    @Override
    public ArrayList<String> getAptCodes(String dongCode){
        return houseInfoDAO.getAptCodes(dongCode);
    }
    @Override
    public ArrayList<HouseDeal> select(ArrayList<String> aptCode, String dealYear, String dealMonth) {
        return houseDealDAO.select(aptCode, dealYear, dealMonth);
    }

    @Override
    public HouseInfo searchByAptCode(String aptCode) {
        return houseInfoDAO.searchByAptCode(aptCode);
    }
}
