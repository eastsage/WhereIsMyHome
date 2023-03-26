package com.ssafy.home.dao;

import com.ssafy.home.vo.DongCode;

import java.util.ArrayList;

public interface DongCodeDAO {
    //동 코드로 시도군구동 이름 얻기
    DongCode getInfoByDongCode(String dongCode);

    //시도구군동 이름을 받아서 동 코드 반환
    String getDongCode(String sidoName, String gugunName, String dongName);
    //시도로 -> 군구 받기
    //군구로 -> 동 받기
    ArrayList<String> getSidos();
    ArrayList<String> getGunguBySido(String sidoName);
    ArrayList<String> getDongBySidoGungu(String sidoName, String gunguName);
}
