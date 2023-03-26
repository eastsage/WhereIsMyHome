package com.ssafy.home.dao;

import com.ssafy.home.vo.DongCode;

public interface DongCodeDAO {
    //동 코드로 시도군구동 이름 얻기
    DongCode getInfoByDongCode(String dongCode);

    //시도구군동 이름을 받아서 동 코드 반환
    String getDongCode(String sidoName, String gugunName, String dongName);
}
