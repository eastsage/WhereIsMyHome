package com.ssafy.home.vo;

public class DongCode {
    String dongCode;
    String sidoName;
    String gugunName;
    String dongName;

    public DongCode() {
    }

    public DongCode(String dongCode, String sidoName, String gugunName, String dongName) {
        this.dongCode = dongCode;
        this.sidoName = sidoName;
        this.gugunName = gugunName;
        this.dongName = dongName;
    }

    public String getDongCode() {
        return dongCode;
    }

    public void setDongCode(String dongCode) {
        this.dongCode = dongCode;
    }

    public String getSidoName() {
        return sidoName;
    }

    public void setSidoName(String sidoName) {
        this.sidoName = sidoName;
    }

    public String getGugunName() {
        return gugunName;
    }

    public void setGugunName(String gugunName) {
        this.gugunName = gugunName;
    }

    public String getDongName() {
        return dongName;
    }

    public void setDongName(String dongName) {
        this.dongName = dongName;
    }
}
