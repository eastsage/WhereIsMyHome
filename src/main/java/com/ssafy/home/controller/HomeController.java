package com.ssafy.home.controller;

import com.ssafy.home.service.HomeService;
import com.ssafy.home.service.HomeServiceImpl;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

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


            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            JSONObject jObject = new JSONObject();

            jObject.put("sidos", homeService.getSidos());
            jObject.put("guguns", homeService.getGuguns(sido));
            jObject.put("dongs", homeService.getDongs(sido, gugun));
            jObject.put("years", homeService.getDealYear(dongCode));
            jObject.put("months", homeService.getDealMonth(dongCode, year));

            out.print(jObject);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
