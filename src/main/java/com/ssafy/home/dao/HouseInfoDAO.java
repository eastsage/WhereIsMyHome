package com.ssafy.home.dao;

import com.ssafy.home.vo.HouseInfo;

import java.util.ArrayList;



public interface HouseInfoDAO {
    //아파트 코드로 정보 반환
    HouseInfo searchByAptCode(String aptCode);

    //검색할 아파트 이름을 포함하고, 해당 동에 속하는 아파트들의 아파트 코드를 반환
    ArrayList<String> getAptCodes(String dongCode);

}
