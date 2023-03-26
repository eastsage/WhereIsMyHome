package com.ssafy.home.service;

import com.ssafy.home.dao.*;
import com.ssafy.home.vo.HouseDeal;
import com.ssafy.home.vo.HouseInfo;

import java.util.ArrayList;

public class HomeService {

    private DongCodeDAO dongCodeDAO;
    private HouseDealDAO houseDealDAO;
    private HouseInfoDAO houseInfoDAO;

    public HomeService(){
        this.dongCodeDAO = new DongCodeDAOImpl();
        this.houseDealDAO= new HouseDealDAOImpl();
        this.houseInfoDAO= new HouseInfoDAOImpl();
    }

/*
    DongCode :  지역 받아서 동코드 반환
    HouseInfo : 아파트 이름과 동코드로 해당하는 아파트 코드 반환
    HouseDeal : 매매연도/월을 받아서 해당하는 아파트들의 매매 정보 반환?
 */
    public ArrayList<HouseDeal> getHouseDealInfo(String searchedName, String sidoName, String gugunName, String dongName, String dealYear, String dealMonth){
        String dongCode = dongCodeDAO.getDongCode(sidoName, gugunName, dongName);
        ArrayList<String> houseCodes = houseInfoDAO.searchAptCodeByNameAndDongCode(searchedName, dongCode);
        ArrayList<HouseDeal> houseDeals = new ArrayList<>();

        for (String code : houseCodes){
            houseDeals.addAll(houseDealDAO.select(code, dealYear, dealMonth));
        }

        return houseDeals;
    }
}
