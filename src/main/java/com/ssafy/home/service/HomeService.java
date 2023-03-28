package com.ssafy.home.service;

import com.ssafy.home.dao.*;
import com.ssafy.home.vo.HouseDeal;
import com.ssafy.home.vo.HouseInfo;

import java.util.ArrayList;

public interface HomeService {
    ArrayList<String> getSidos();
    ArrayList<String> getGuguns(String sido);
    ArrayList<String> getDongs(String sido, String gugun);
    ArrayList<String> getDealYear(ArrayList<String> aptCode);
    ArrayList<String> getDealMonth(ArrayList<String> aptCode, String dealYear);
    String getDongCode(String sido, String gugun, String dong);
    ArrayList<String> getAptCodes(String dongCode);
    ArrayList<HouseDeal> select(ArrayList<String> aptCode, String dealYear, String dealMonth);
    HouseInfo searchByAptCode(String aptCode);
}

