package com.ssafy.home.service;

import com.ssafy.home.dao.*;
import com.ssafy.home.vo.HouseDeal;
import com.ssafy.home.vo.HouseInfo;

import java.util.ArrayList;

public interface HomeService {
    ArrayList<HouseDeal> getHouseDealInfo(String searchedName, String sidoName, String gugunName, String dongName, String dealYear, String dealMonth);
    ArrayList<String> getSidos();
    ArrayList<String> getGunguBySido(String sidoName);
    ArrayList<String> getDongBySidoGungu(String sidoName, String gunguName);
}