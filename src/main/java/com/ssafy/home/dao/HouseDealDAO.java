package com.ssafy.home.dao;

import com.ssafy.home.vo.HouseDeal;
import com.ssafy.home.vo.HouseInfo;

import java.util.ArrayList;

public interface HouseDealDAO {

    //아파트 코드, 매매연도, 월을 받아서 매매 정보 리스트 반환
    ArrayList<HouseDeal> select(String aptCode, String dealYear, String dealMonth);
}
