package com.ssafy.home.controller;

import com.ssafy.home.service.HomeService;
import com.ssafy.home.service.HomeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
    private HomeService homeService;

    public HomeController(){
        this.homeService = new HomeServiceImpl();
    }

    public void getSidos(HttpServletRequest request, HttpServletResponse response) {
        String sido = request.getParameter("sido");
        String gugun = request.getParameter("gugun");
        String dong = request.getParameter("dong");
        String dealYear = request.getParameter("year");
        String dealMonth = request.getParameter("month");

        request.setAttribute("sidos", homeService.getSidos());
        request.setAttribute("guguns", homeService.getGunguBySido(sido));
        request.setAttribute("dongs", homeService.getDongBySidoGungu(sido, gugun));

        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
