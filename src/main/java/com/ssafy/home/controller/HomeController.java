package com.ssafy.home.controller;

import com.ssafy.home.service.HomeService;
import com.ssafy.home.service.HomeServiceImpl;
import com.ssafy.home.vo.HouseDeal;
import com.ssafy.home.vo.HouseInfo;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HomeController {
    private HomeService homeService;

    public HomeController(){
        this.homeService = new HomeServiceImpl();
    }

    public void getSidos(HttpServletRequest request, HttpServletResponse response) {
        try {
            String sido = request.getParameter("sido");
            String gugun = request.getParameter("gugun");
            String dong = request.getParameter("dong");
            String year = request.getParameter("year");
            String dongCode = homeService.getDongCode(sido, gugun, dong);
            ArrayList<String> aptCodes = homeService.getAptCodes(dongCode);

            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            JSONObject jObject = new JSONObject();

            jObject.put("sidos", homeService.getSidos());
            jObject.put("guguns", homeService.getGuguns(sido));
            jObject.put("dongs", homeService.getDongs(sido, gugun));
            jObject.put("years", homeService.getDealYear(aptCodes));
            jObject.put("months", homeService.getDealMonth(aptCodes, year));

            out.print(jObject);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getList(HttpServletRequest request, HttpServletResponse response){
        try {
            String aptName = request.getParameter("aptName");
            String sido = request.getParameter("sido");
            String gugun = request.getParameter("gugun");
            String dong = request.getParameter("dong");
            String year = request.getParameter("year");
            String month = request.getParameter("month");
            String dongCode = homeService.getDongCode(sido, gugun, dong);
            ArrayList<String> aptCodes = homeService.getAptCodes(dongCode);
            ArrayList<HouseDeal> selected = homeService.select(aptCodes, year, month);

            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();

            JSONArray jArray = new JSONArray();

            for (HouseDeal deal : selected){
               JSONObject jObject = new JSONObject();
               HouseInfo info = homeService.searchByAptCode(deal.getAptCode());
               String apartmentName = info.getApartmentName();
               if (!apartmentName.contains(aptName)) continue;
               jObject.put("aptName", info.getApartmentName());
               jObject.put("floor", deal.getFloor());
               jObject.put("area", deal.getArea());
               jObject.put("dong", info.getDong());
               jObject.put("dealAmount", deal.getDealAmount());
               jArray.put(jObject);
            }

            out.print(jArray);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
